/**
Exercise: Run
A laptop has two functions, turnOn and turnOff.

To make sure it works as expected, every time we have a new laptop object, the protocol is to turn it off and then back on again.

Create a laptop object and implement the protocol.
 */

fun main(args: Array<String>) {
    val firstLaptop = Laptop()
    val secondLaptop = Laptop()

    firstLaptop.run {
        turnOff()
        turnOn()
    }

    secondLaptop.run {
        turnOff()
        turnOn()
    }
}

class Laptop {
    fun turnOn() {
        println("Laptop turned ON.")
    }

    fun turnOff() {
        println("Laptop turned OFF.")
    }
}