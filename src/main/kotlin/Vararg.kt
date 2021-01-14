/**
Exercise: Vararg
Create a function that takes an integer variable “count” and a variable number of client names. Print out “count” hello messages for each client.

i.e. if count = 3, print out 3 hello messages for each client.
 */

fun main(args: Array<String>) {
    printHello(3, "Mark", "Marvin", "Blanca", "Hi")
}

fun printHello(count: Int, vararg names: String) {
    for (i in names) {
        for (j in 1..count) {
            println("Hello $i")
        }
    }
}