/**
Exercise: Type Conversion
Ask the user to input a number of type double.

Multiply it by pi

var pi = 4.14159

Print the type of the resulting variable.

Print the result.
 */

fun main(args: Array<String>) {
    val pi = 4.14159

    print("Please input a number of type double: ")
    val input = readLine() ?: "1.0"

    val result = input.toDouble() * pi

    println(result)
    println(result::class.java)
}