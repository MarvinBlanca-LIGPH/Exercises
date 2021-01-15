/**
Exercise: Also
Whenever a car is built, the company logs must be updated and the police notified.

Implement this functionality in a program.
 */

fun main(args: Array<String>) {
    CarBuilt().apply {
        carDone()
    }.also {
        println("Log: Notifying police that car is built.")
    }
}

class CarBuilt {
    fun carDone() {
        println("Car is built.")
    }
}