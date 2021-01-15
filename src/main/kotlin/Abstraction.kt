/**
Exercise: Abstraction
A default oven has an average cooking speed, top temperature and function for cooking.

A Bosch oven has a higher cooking temperature.

A Roaster oven does not cook but roasts. The speed and temperature are average.

Implement this in a program and print out the various information for the objects.
 */

fun main(args: Array<String>) {
    val bosch: Oven = Bosch()
    val roaster: Oven = Roaster()

    bosch.cooking()
    roaster.cooking()
}

abstract class Oven {
    val averageCookingSpeed = 180
    open val averageTemperature = 120

    abstract fun cooking()
}

class Bosch : Oven() {
    override val averageTemperature = 240

    override fun cooking() {
        println("Bosch oven will be cooking for $averageCookingSpeed minutes at $averageTemperature degrees celsius.")
    }
}

class Roaster : Oven() {
    override fun cooking() {
        println("Roaster oven will be roasting for $averageCookingSpeed minutes at $averageTemperature degrees celsius.")
    }
}