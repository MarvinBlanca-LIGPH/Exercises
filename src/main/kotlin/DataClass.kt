import kotlin.collections.ArrayList

/**
Exercise: Data classes
A network server responds with this information about blog articles

Title

Content

Number of readers

You receive 2 articles from the server.

Update the title to suit your blog but also keep the originals.

Print out all the article information.
 */

fun main(args: Array<String>) {
    val articles = ArrayList<Article>()
    val newArticle = ArrayList<Article>()

    articles.add(Article("Kotlin Basics", "Kotlin tutorial ", 20000))
    articles.add(Article("Kotlin Intermediate", "Intermediate Kotlin tutorial ", 10000))
    articles.add(Article("Kotlin Advanced", "Advanced Kotlin tutorial ", 5000))

    articles.forEach {
        println("Title: ${it.title} - Content: ${it.content} - Readers: ${it.readers}")
    }

    for (article in articles) {
        newArticle.add(article)

        val update = article.copy(title = article.title + " by Marvin Blanca")

        newArticle.add(update)
    }

    println("\nUpdated\n")
    newArticle.forEach {
        println("Title: ${it.title} - Content: ${it.content} - Readers: ${it.readers}")
    }
}

data class Article(
    val title: String,
    val content: String,
    val readers: Int
)
