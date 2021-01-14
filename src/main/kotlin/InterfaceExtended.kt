/**
Exercise: More interfaces
A car will drive you to a destination, but a limousine will drive you there in comfort. A car rental place has both, at different prices.

One day you want a utility car that is cheaper.

Another day, you want a luxury car.

Implement this functionality in a program and display the appropriate messages.
 */

fun main(args: Array<String>) {
    val utilityCar = ChooseCar().mood("utility")
    val luxuryCar = ChooseCar().mood("luxury")

    utilityCar.perks()
    luxuryCar.perks()
}

interface Car {
    fun perks()
}

class LimousineCar : Car {
    override fun perks() {
        println("A limousine can drive you to your destination and will drive you there in comfort.")
    }
}

class RentalCar : Car {
    override fun perks() {
        println("A rental car can drive you to your destination and will drive you in comfort, but at different prices.")
    }
}

class ChooseCar {
    fun mood(mood: String): Car {
        return when (mood) {
            "utility" -> RentalCar()
            else -> LimousineCar()
        }
    }
}