/**
Exercise: takeIf and takeUnless
Have the user introduce 10 numbers.

Print a list that contains only odd numbers and make sure to exclude the numbers 3 and 13.
 */

fun main(args: Array<String>) {
    val arrayList = ArrayList<Int>()

    for (i in 1..10) {
        print("Please input a number: ")
        val input = readLine()

        input?.let { number ->
            number.toInt().takeUnless {
                it % 2 == 0 || it == 3 || it == 13
            }?.let {
                arrayList.add(it)
            }
        }
    }

    println(arrayList)
}