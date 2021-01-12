/**
Exercise: When conditional
Ask the user to input their name.

Based on the first letter of their name, print out a personalised greeting

for the first 3 letters of the alphabet,

a different one for the next 3 letters,

and a third message for the rest
 */

fun main(args: Array<String>) {
    print("Please input your name: ")
    val name = readLine() ?: ""

    when (name[0]) {
        in 'A'..'C' -> println("Hi $name, how are you?")
        in 'D'..'F' -> println("Hi $name, kumusta ka?")
        else -> println("Hi $name, nice to meet you.")
    }
}