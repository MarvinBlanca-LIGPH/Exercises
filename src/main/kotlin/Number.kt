/**
Exercise: Numbers
Ask the user to input a number and read it into a variable.

Convert it to an integer.

Multiply that value with a double variable that you created.

What is the type of the new variable?

Print it to the console.


 */

fun main(args: Array<String>) {
    val div = 8.16
    print("Please input a number: ")
    val input = readLine() ?: "1"

    val number = input.toInt() * div

    println("$input multiplied by $div is ${number * div}")
    println(number::class.java)
}