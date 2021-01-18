/**
Exercise: lazy
An object of a class NewUser is created for each new user.
It contains a function to print a welcome message.

In your program, you have a list of banned usernames.

Ask the user to input their desired username.
If it is not part of the list, create the NewUser object and print the welcome message.
 */

fun main(args: Array<String>) {
    val bannedUsersList = arrayListOf("Yu", "Rr", "Van", "Zez")
    val newUser by lazy { NewUser() }

    for (i in 1..5) {
        print("Please input username: ")
        val input = readLine() ?: ""

        if (!bannedUsersList.contains(input)) newUser.printMessage(input)
    }
}

class NewUser {
    fun printMessage(name: String) {
        println("Welcome $name\n")
    }
}