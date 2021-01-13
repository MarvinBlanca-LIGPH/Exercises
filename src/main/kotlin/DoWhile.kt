/**
Exercise: Do while loop
You have a set of usernames

val usernames = hashSetOf(“john”, “bob”, “alice”)

Ask the user to choose their username. If their username is taken, print out a message and ask again.

Add the username to the set.
 */

fun main(args: Array<String>) {
    val userNames = hashSetOf("john", "bob", "alice")
    var valid = false

    do {
        print("Input your desired username: ")
        val name = readLine() ?: ""
        if (userNames.contains(name)) {
            println("Username already taken, Please try again.")
        } else {
            println("$name is a valid username, Thank you.")
            userNames.add(name)
            valid = true
        }
    } while (!valid)

    println(userNames)
}