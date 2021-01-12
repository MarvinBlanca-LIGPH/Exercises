/**
 * Exercise: List and ArrayList
You have a number of items on your desk.

val items = arrayListOf(“laptop”, “mouse”, “pen”, “paper”, “mug”, “phone”)

You clean up your desk and remove as many items as you can to be more productive.

val removedItems = listOf(“pen”, “paper”, “mug”, “phone”)

Print out the remaining items.


 */
fun main(args: Array<String>) {
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removeItems = listOf("pen", "paper", "mug", "phone")
    items.removeAll(removeItems)
    println(items)
}