/**
Exercise: Break and continue
A group of young people are going to a nightclub.

Design a program that accepts user ages.

The program displays a welcome message for each user.

If it receives an age lower than 18, it prints a message that this client is not allowed.

If it receives the word “stop”, the program ends
 */

fun main(args: Array<String>) {
    for (i in 1..Int.MAX_VALUE) {
        print("Hi user please input your age: ")
        val input = readLine() ?: "18"

        if (input == "stop") break

        val age = input.toInt()

        if (age < 18) {
            println("Sorry you are not allowed to enter the club.")
            continue
        }
        println("Welcome!!!")
    }
}