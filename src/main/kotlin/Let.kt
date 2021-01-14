/**
Exercise: Let
Read client names from the console until the word stop is introduced. If the string is empty, the client is null.

Print out a hello message for each client.
 */

fun main(args: Array<String>) {
    val client = arrayListOf<String?>()

    do {
        print("Input client's name: ")
        val input = readLine()
        input?.let {
            if (it.isEmpty()) {
                client.add(null)
            } else {
                client.add(it)
            }
        }
    } while (!input.equals("stop"))

    client.forEach {
        it?.let { client ->
            println("\nHi $client, welcome to the club.")
        }
    }
}