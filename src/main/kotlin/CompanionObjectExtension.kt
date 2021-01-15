/**
Exercise: Companion object extensions
Add a companion object function to the Double class that prints out the class name.

Call the companion object extension function.
 */

fun main(args: Array<String>) {
    println(Double.printClassName())
}

fun Double.Companion.printClassName() = "This is a Double Class!"