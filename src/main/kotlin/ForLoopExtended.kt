/**
Exercise: Extended for loops
Ask the user for a number.

Print out a square matrix of the size indicated by the number.

Inside each cell, print out 1 emoji

😀 If the row*column is divisible by 3
🤨 If the row*column % 3 is 1
😱 If the row*column % 3 is 2
 */

fun main(args: Array<String>) {
    print("Input a number: ")
    val input = readLine() ?: "0"
    val number = input.toInt()

    for (i in 1..number) {
        for (j in 1..number) {
            when (i * j % 3) {
                0 -> print("\uD83D\uDE00\t")
                1 -> print("\uD83E\uDD28\t")
                2 -> print("\uD83D\uDE31\t")
            }
        }
        println()
    }
}