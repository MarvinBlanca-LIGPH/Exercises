import kotlin.random.Random

/**
Exercise: lateinit
Define a variable message as a String. Then define a list of prime numbers.

A function takes the list of integers and randomly returns one of them.
Use it to initialize the message variable with a message including the returned prime number.

Print out the message.

This exercise can easily be solved in a way that doesn’t use lateinit var.
For the sake of practice, please use it in this case.
 */

fun main(args: Array<String>) {
    lateinit var message: String
    val primeNumbers = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37)

    message = getOneNumber(primeNumbers).toString()

    println("The returned prime number is: $message")
}

fun getOneNumber(list: List<Int>) = list.random()