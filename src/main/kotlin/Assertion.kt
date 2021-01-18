/**
Exercise: Elvis and assertions
A product costs 29.99.

Ask a user at the console how many products they want to buy.

If the read value is null, use the default of one.

Print the total of the purchase.
 */

fun main(args: Array<String>) {
    val productCost = 29.99

    print("How many products do you want to buy: ")
    val input = readLine()

    val quantity = input?.toInt() ?: 1

    println("Total amount of purchase: ${quantity * productCost}")
}