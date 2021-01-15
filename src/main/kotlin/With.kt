/**
Exercise: With
A store has a supply of shoes, shirts and jackets, as well as a method to print out the inventory.

Create a variable of type store, update its stock and print out the inventory.
 */

fun main(args: Array<String>) {
    val store = Store()

    with(store) {
        shoes = 25
        shirts = 100
        jackets = 10

        printInventory()
    }
}

class Store {
    var shoes = 0
    var shirts = 0
    var jackets = 0

    fun printInventory() {
        println("There are $shoes shoes, $shirts shirts, and $jackets jackets in stock.")
    }
}