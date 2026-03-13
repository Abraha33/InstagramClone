package unab.edu.co.abrahamcaceres.instagramclone.data

import unab.edu.co.abrahamcaceres.instagramclone.model.Post
import unab.edu.co.abrahamcaceres.instagramclone.model.Story

object DataSource {
    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "android_developer",
            profileImageUrl = "https://picsum.photos/seed/user1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/800/800",
            likes = 1204,
            caption = "Explorando Jetpack Compose \uD83D\uDE80 #Android #Kotlin"
        ),
        Post(
            id = 2,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/800/800",
            likes = 847,
            caption = "Data classes son la mejor feature de Kotlin ❤️",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "compose_ui",
            profileImageUrl = "https://picsum.photos/seed/user3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/800/800",
            likes = 3456,
            caption = "Material3 + Compose = perfecta combinación \uD83C\uDFA8"
        ),
        Post(
            id = 4,
            username = "google_devs",
            profileImageUrl = "https://picsum.photos/seed/user4/200/200",
            imageUrl = "https://picsum.photos/seed/post4/800/800",
            likes = 12891,
            caption = "Android 15 trae increíbles mejoras de performance! \uD83D\uDCF1"
        ),
        Post(
            id = 5,
            username = "mobile_craft",
            profileImageUrl = "https://picsum.photos/seed/user5/200/200",
            imageUrl = "https://picsum.photos/seed/post5/800/800",
            likes = 629,
            caption = "LazyColumn vs RecyclerView: ¿cuál prefieres? \uD83E\uDD14"
        ),
        Post(
            id = 6,
            username = "ux_android",
            profileImageUrl = "https://picsum.photos/seed/user6/200/200",
            imageUrl = "https://picsum.photos/seed/post6/800/800",
            likes = 2103,
            caption = "Animaciones fluidas con animate*AsState \uD83D\uDCAB",
            isLiked = true
        ),
        Post(
            id = 7,
            username = "dev_colombia",
            profileImageUrl = "https://picsum.photos/seed/user7/200/200",
            imageUrl = "https://picsum.photos/seed/post7/800/800",
            likes = 445,
            caption = "Coil hace super fácil cargar imágenes en Compose \uD83D\uDDBC️"
        ),
        Post(
            id = 8,
            username = "tech_lover",
            profileImageUrl = "https://picsum.photos/seed/user8/200/200",
            imageUrl = "https://picsum.photos/seed/post8/800/800",
            likes = 312,
            caption = "Siempre aprendiendo algo nuevo \uD83D\uDCA1"
        ),
        Post(
            id = 9,
            username = "code_daily",
            profileImageUrl = "https://picsum.photos/seed/user9/200/200",
            imageUrl = "https://picsum.photos/seed/post9/800/800",
            likes = 1420,
            caption = "La constancia es la clave del éxito \uD83D\uDCBB"
        ),
        Post(
            id = 10,
            username = "app_maker",
            profileImageUrl = "https://picsum.photos/seed/user10/200/200",
            imageUrl = "https://picsum.photos/seed/post10/800/800",
            likes = 890,
            caption = "Diseñar interfaces con Compose es muy divertido ✨",
            isLiked = true
        )
    )

    fun getStories(): List<Story> = listOf(
        Story(1, "Tu historia", "", hasSeen = false),
        Story(2, "android_dev", "https://picsum.photos/seed/s2/200/200"),
        Story(3, "kotlin_fan", "https://picsum.photos/seed/s3/200/200"),
        Story(4, "google_io", "https://picsum.photos/seed/s4/200/200", hasSeen = true),
        Story(5, "mobile_craft", "https://picsum.photos/seed/s5/200/200"),
        Story(6, "ux_android", "https://picsum.photos/seed/s6/200/200", hasSeen = true),
        Story(7, "dev_colombia", "https://picsum.photos/seed/s7/200/200")
    )
}
