/**
Exercise: Interfaces
Coffee will wake you up but also quench your thirst. There are different types of coffee, Arabica and Robusta.
But since you don’t really care about that, you just go to the coffee shop and ask for a coffee, which they will happily provide.

You will then drink the coffee to both wake you up and quench your thirst.

Implement this in a program.
 */

fun main(args: Array<String>) {
    val buyArabica = CoffeeShop().buyArabicaCoffee()
    val buyRobusta = CoffeeShop().buyRobustaCoffee()

    buyArabica.wakeUp()
    buyArabica.quenchThirst()
    println()
    buyRobusta.wakeUp()
    buyRobusta.quenchThirst()
}

interface Coffee {
    fun wakeUp()
    fun quenchThirst()
}

class Arabica : Coffee {
    override fun wakeUp() {
        println("Drinking Arabica coffee wakes you up.")
    }

    override fun quenchThirst() {
        println("Drinking Arabica coffee will quench your thirst.")
    }
}

class Robusta : Coffee {
    override fun wakeUp() {
        println("Drinking Robusta coffee wakes you up.")
    }

    override fun quenchThirst() {
        println("Drinking Robusta coffee will quench your thirst.")
    }
}

class CoffeeShop {
    fun buyArabicaCoffee(): Coffee {
        return Arabica()
    }

    fun buyRobustaCoffee(): Coffee {
        return Robusta()
    }
}