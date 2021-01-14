/**
Exercise: Common Higher Order Functions
Given a collection of random integers.

If a number is odd, double it.

If a number is even, half it.

Print out a subset of the collection that has numbers greater than 25.
 */

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 78, 90, 100, 2000, 123, 134, 555, 111, 24, 25, 250)

    val map = numberList.map {
        if (it % 2 == 0) {
            it / 2
        } else {
            it * 2
        }
    }

    val filter = numberList.filter { it > 25 }

    println(map)
    println(filter)
}