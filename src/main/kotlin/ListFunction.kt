/**
 * Exercise: List functions
A zoo has a list of animals.

val animals = arrayListOf(“lion”, “zebra”, “chimp”, “elephant”)

A new panda bear cub has arrived.

Print out the new list of animals.

The lion has been sold to a different zoo.

Print out the new list of animals.

Does the zoo have both elephants and giraffes?
 */
fun main(args: Array<String>) {
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    animals.add("panda")
    println(animals)

    animals.remove("lion")
    println(animals)

    val animalsCheck = listOf("elephant", "giraffe")
    val hasAnimals = animals.containsAll(animalsCheck)
    println("Does the zoo have elephant and giraffe? $hasAnimals")
}