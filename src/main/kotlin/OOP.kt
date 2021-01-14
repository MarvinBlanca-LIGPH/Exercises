/**
Exercise: Object Oriented Programming
Create a calculator class. It should have

A variable that stores the total

A function that adds a number to the total

A function that subtracts a number from the total

A function that multiplies the total by an amount

A function that divides the total by an amount

A function that resets the total to 0

Create an object, test out the functions and print out some results.
 */

fun main(args: Array<String>) {
    val calculator = Calculator()

    calculator.add(50)
    calculator.add(250)
    calculator.sub(50)
    calculator.mul(4)
    calculator.div(10)
    calculator.reset()
}

class Calculator {
    var total = 0

    fun add(number: Int) {
        total += number
        println("Total is: $total")
    }

    fun sub(number: Int) {
        total -= number
        println("Total is: $total")
    }

    fun mul(number: Int) {
        total *= number
        println("Total is: $total")
    }

    fun div(number: Int) {
        total /= number
        println("Total is: $total")
    }

    fun reset() {
        total = 0
        println("Total is reset to $total")
    }
}