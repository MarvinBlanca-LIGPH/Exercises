/**
Exercise: The init block
A web browser will connect and display the home page when first started.

Create a class that achieves this functionality when instantiated.
 */

fun main(args: Array<String>) {
    val connect = Connect("https://www.github.com")
}

class Connect(val url: String) {
    init {
        println("Successfully displayed and connected to $url")
    }
}