import java.lang.Exception

/**
 * Exercise: Try catch finally
A customer will tell the program what product they want to buy.

Then, they will tell the program how many products they require.

Assume the price of the product is 9.99

What is the total?

Handle any exceptions that might occur.
 */
fun main(args: Array<String>) {
    val fixPrice = 9.99

    print("Please input the product you want to purchase: ")
    val product = readLine()
    print("Please input the quantity: ")
    val quantity = readLine()

    try {
        val total = quantity?.toInt()?.times(fixPrice)
        println("Total amount for $quantity $product is $total")
    } catch (e: Exception) {
        println("$quantity is not a valid quantity value")
        e.printStackTrace()
    } finally {
        println("Next customer please!")
    }
}