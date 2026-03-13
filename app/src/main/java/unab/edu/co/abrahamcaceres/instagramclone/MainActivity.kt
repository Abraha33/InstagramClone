package unab.edu.co.abrahamcaceres.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import unab.edu.co.abrahamcaceres.instagramclone.ui.screens.FeedScreen
import unab.edu.co.abrahamcaceres.instagramclone.ui.theme.InstagramCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramCloneTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    FeedScreen()
                }
            }
        }
    }
}