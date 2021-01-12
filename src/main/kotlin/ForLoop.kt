/**
Exercise: For loops
Ask the user to input a year. For each month of that year, print out how many days there are.

Make sure you count leap years.

Assume a leap year is a year that is divisible by 4.

 *there are additional rules for leap years, but we will ignore those in this exercise
 */

fun main(args: Array<String>) {
    print("Input a year: ")
    val input = readLine() ?: "1995"

    val year = input.toInt()

    for (i in 1..12) {
        when (i) {
            1 -> println("January has 31 days")
            2 -> println("February has ${if (year % 4 == 0) "29 days" else "28 days"}")
            3 -> println("March has 31 days")
            4 -> println("April has 30 days")
            5 -> println("May has 31 days")
            6 -> println("June has 30 days")
            7 -> println("July has 31 days")
            8 -> println("August has 31 days")
            9 -> println("September has 30 days")
            10 -> println("October has 31 days")
            11 -> println("November has 30 days")
            12 -> println("December has 31 days")
        }
    }
}