package unab.edu.co.abrahamcaceres.instagramclone.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import unab.edu.co.abrahamcaceres.instagramclone.data.DataSource
import unab.edu.co.abrahamcaceres.instagramclone.ui.components.PostCard
import unab.edu.co.abrahamcaceres.instagramclone.ui.components.StoriesRow

@Composable
fun FeedScreen() {
    val posts = remember { DataSource.getPosts() }
    val stories = remember { DataSource.getStories() }

    Scaffold(
        topBar = { InstagramTopBar() }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            state = rememberLazyListState()
        ) {
            /* --- Las stories van como un único elemento --- */
            item(key = "stories_row") {
                StoriesRow(stories = stories)
                HorizontalDivider()
            }

            /* --- Los posts se iteran --- */
            items(
                items = posts,
                key = { post -> post.id }
            ) { post ->
                PostCard(
                    post = post,
                    onLikeClick = { likedPost ->
                        Log.d("Feed", "Like en: ${likedPost.username}")
                    }
                )
            }
            
            item {
                Text(
                    text = "Has llegado al final \uD83C\uDF89",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramTopBar() {
    TopAppBar(
        title = {
            Text(
                text = "Instagram",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                fontFamily = FontFamily.Cursive
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(Icons.Outlined.FavoriteBorder, "Notificaciones")
            }
            IconButton(onClick = {}) {
                Icon(Icons.Outlined.Send, "Mensajes")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White
        )
    )
}
