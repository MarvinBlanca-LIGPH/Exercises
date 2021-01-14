/**
Exercise: Null
Read a number from the console and convert it to Double.

Multiply it by 7, and convert the result into a string.

Print the length of that string to the console.
 */

fun main(args: Array<String>) {
    print("Please input a number of type double: ")
    val input = readLine()
    val number = input?.toDouble()?.times(7)

    println("Length of $number is ${number.toString().length}")
}