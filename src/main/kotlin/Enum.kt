/**
Exercise: Enum classes
The medals in the olympics are

GOLD - 1st place

SILVER - 2nd place

BRONZE - 3rd place

NONE - other

Create a class Olympics that has a function which returns the medal a contestant won based on the position they finished on.
It also has a function which returns the position of a contestant based on the medal they won.
Create an object of that class and call its methods.
 */

fun main(args: Array<String>) {
    val olympics = Olympics()

    println(olympics.getMedal(8))
    println(olympics.getMedal(3))
    println(olympics.getMedal(2))
    println(olympics.getMedal(1))
    println()
    println(olympics.getPosition(Medal.None))
    println(olympics.getPosition(Medal.Bronze))
    println(olympics.getPosition(Medal.Silver))
    println(olympics.getPosition(Medal.Gold))
}

class Olympics {
    fun getMedal(position: Int): Medal {
        return when (position) {
            1 -> Medal.Gold
            2 -> Medal.Silver
            3 -> Medal.Bronze
            else -> Medal.None
        }
    }

    fun getPosition(medal: Medal) = medal.position
}

enum class Medal(val position: Int) {
    Gold(1),
    Silver(2),
    Bronze(3),
    None(4)
}