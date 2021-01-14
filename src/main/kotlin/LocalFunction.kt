/**
Exercise: Local functions
Create a function that asks the user for a name until an empty string is introduced.

Create a local function that takes a name and prints a greeting.

For each name introduced, print out a greeting.
 */

fun main(args: Array<String>) {
    askInput()
}

fun askInput() {
    fun printInput(name: String) {
        println("Hello $name")
    }

    do {
        print("Please input a name: ")
        val name = readLine() ?: ""

        if (name.isNotEmpty()) printInput(name)

        println()
    } while (name.isNotEmpty())
}