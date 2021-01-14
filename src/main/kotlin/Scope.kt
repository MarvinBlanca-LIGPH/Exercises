/**
Exercise: Scope
You have the following program.

fun main(args: Array<String>) {
var parakeets = 5
buyMoreParaqueets(parakeets)
println("You now have $parakeets parakeets")
}

fun buyMoreParakeets(parakeets: Int) {
val parakeets = 3
}
What is the outcome when running this program?
 */

fun main(args: Array<String>) {
    var parakeets = 5

    buyMoreParakeets(parakeets)
    println("You now have $parakeets parakeets")
}

fun buyMoreParakeets(parakeets: Int) {
    val parakeets = 3
}