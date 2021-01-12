/**
 * Exercise: Map and HashMap
You manage an amusement park, and you have a map that stores dates and attendance.

var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))

Add a value for 26 Sept.

How many people attended in total on 25 and 26 Sept?

Is data for 22 Sept available?


 */
fun main(args: Array<String>) {
    val attendance = hashMapOf(
        Pair("23 Sept", 2837),
        Pair("24 Sept", 3726),
        Pair("25 Sept", 6253)
    )

    attendance["26 Sept"] = 7000

    val totalPeople = (attendance["25 Sept"] ?: 0) + (attendance["26 Sept"] ?: 0)
    println("There are $totalPeople people in attendance from September 25 to 26")

    println("Is data for 22 Sept available? ${attendance.containsKey("22 Sept")}")
}