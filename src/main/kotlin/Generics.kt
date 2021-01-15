/**
Create a class that takes a generic type T,
and has a function that converts the type to String and prints a message that includes the argument passed.

Instantiate the class with different types and call the function.
 */

fun main(args: Array<String>) {
    val genericString = Generic<String>()
    genericString.printThis("Testing test")

    val genericInt = Generic<Int>()
    genericInt.printThis(100)

    val genericDouble = Generic<Double>()
    genericDouble.printThis(08.16)
}

class Generic<T> {
    fun printThis(item: T) {
        println("Argument converted to string is: ${item.toString()}")
    }
}