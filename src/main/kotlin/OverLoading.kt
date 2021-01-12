/**
Exercise: Overloading
Create a function that takes a product name and price. It adds 20% tax to that product and displays a message saying how much the product costs.

Overload the function so that it takes a map of products and prices, and does the same thing.

Call both functions in your program.
 */

fun main(args: Array<String>) {
    val map = mapOf(
        Pair("phone", 10000),
        Pair("laptop", 20000),
        Pair("alcohol", 50)
    )

    taxCalculator("bag", 250)
    taxCalculator(map)
}

fun taxCalculator(product: String, price: Int) {
    println("$product cost ${price * 1.2}")
}

fun taxCalculator(collection: Map<String, Int>) {
    println()
    for (i in collection) {
        taxCalculator(i.key, i.value)
    }
}