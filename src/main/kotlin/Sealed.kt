import kotlin.random.Random

/**
Exercise: Sealed classes
A lottery returns prizes. It can either return a car, a vacation or a gift card.

A function lottery returns prizes every time it is called. It will randomly return one of the three types of prizes.

Print out a specific message for each type of prize won
 */

fun main(args: Array<String>) {
    for (i in 1..10) {
        when (getPrize()) {
            is Toyota -> println("Congratulations you won a brand new car.")
            is Philippines -> println("Congratulations you a trip for two around the Philippines.")
            else -> println("Congratulations you won a SM Gift Card.")
        }
    }
}

fun getPrize(): Prize {
    return when (Random.nextInt(3)) {
        0 -> Toyota
        1 -> Philippines
        else -> SMGC
    }
}

abstract class Prize

sealed class CarPrize : Prize()

sealed class VacationPrize : Prize()

sealed class GiftCardPrize : Prize()

object Toyota : CarPrize()
object Philippines : VacationPrize()
object SMGC : GiftCardPrize()