/**
Exercise: While loop
Ask the user to input a large integer.

Print out all the numbers that are divisible by 7, that are less than the user’s number. */

fun main(args: Array<String>) {
    print("Input a Large integer: ")
    val input = readLine() ?: "100"
    val largeNum = input.toInt()
    var num = 0

    while (num < largeNum) {
        if (num % 7 == 0) println(num)
        num++
    }
}