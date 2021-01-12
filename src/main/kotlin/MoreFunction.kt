/**
Exercise: More functions
Create a function that receives the name of an animal, and returns the estimated lifespan.

cats -> 15
dogs -> 10
rabbit -> 12
everything else -> 20

Ask the user to input an animal, then print out the estimated lifespan for that animal.
 */

fun main(args: Array<String>) {
    print("Please input an animal to check its life span: ")
    val input = readLine() ?: ""
    val lifeSpan = lifeSpanChecker(input)

    println("The estimated life span for $input is $lifeSpan")
}

fun lifeSpanChecker(animal: String): Int {
    return when (animal) {
        "cat", "cats" -> 15
        "dog", "dogs" -> 10
        "rabbit", "rabbits" -> 12
        else -> 20
    }
}