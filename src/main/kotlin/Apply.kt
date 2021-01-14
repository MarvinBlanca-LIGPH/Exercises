/**
Exercise: Apply
A coffee shop serves cups of coffee. A cup of coffee has a client name and a method for preparing the coffee.

Read a client name from the console, then call the sellCoffee method of the coffee shop. Create a coffee cup object,
initialise it and serve it to the client.
 */

fun main(args: Array<String>) {
    print("Please input client's name: ")
    val name = readLine() ?: ""

    Shop().sellCoffee(name)
}

class Shop {
    fun sellCoffee(name: String) {
        CoffeeCup().apply {
            clientName = name
            preparingCoffee()
            println("Coffee for $clientName ready.")
        }
    }
}

class CoffeeCup {
    var clientName = ""

    fun preparingCoffee() {
        println("Preparing coffee for $clientName.")
    }
}