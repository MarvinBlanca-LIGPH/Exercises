/**
Exercise: While loop
Ask the user to input a large integer.

Print out all the numbers that are divisible by 7, that are less than the user’s number. */

fun main(args: Array<String>) {
    print("Input a Large integer: ")
    val input = readLine() ?: "100"
    val largeNumber = input.toInt()
    var number = 0

    while (number < largeNumber) {
        if (number % 7 == 0) println(number)
        number++
    }
}