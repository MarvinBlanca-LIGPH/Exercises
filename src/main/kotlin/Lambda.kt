/**
Exercise: Lambdas and Higher Order Functions
Create a Higher Order Function that takes a list of client names and a lambda expression that returns a String.

It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.

Create a lambda expression that takes a client name String and returns a personalised message.

Call the HOF and print out the result.
 */

fun main(args: Array<String>) {
    val clientList = listOf("Mark", "Marvin", "Mirasol", "Blanca")
    val messages = getMessages(clientList) { name -> "Hi $name, how are you?" }

    for (i in 0 until messages.size) {
        println(messages[i])
    }
}

fun getMessages(clientList: List<String>, setName: (String) -> String): ArrayList<String> {
    val client = ArrayList<String>()

    for (name in clientList) {
        client.add(setName(name))
    }
    return client
}