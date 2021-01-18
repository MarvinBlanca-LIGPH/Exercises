import kotlin.random.Random

/**
Exercise: type casting
The classes Cat and Dog inherit from an abstract class Animal.
The Cat class has a function purr() and
the Dog class has a function bark()

A function provides a list of animals, that are randomly distributed.

Design a program that invokes each respective function of each type of Animal from the list.
 */

fun main(args: Array<String>) {
    val animals = identifyAnimal()

    animals.forEach { type ->
        (type as? Dog)?.bark()
        (type as? Cat)?.purr()
    }

    println()

    animals.forEach { type ->
        if (type is Dog) Dog().bark()
        else Cat().purr()
    }
}

abstract class Animals

class Cat : Animals() {
    fun purr() {
        println("Cats purr.")
    }
}

class Dog : Animals() {
    fun bark() {
        println("Dogs bark.")
    }
}

fun identifyAnimal(): ArrayList<Animals> {
    val animals = arrayListOf<Animals>()

    for (i in 1..10) {
        animals.add(
            when (Random.nextInt(1000) % 2) {
                0 -> Cat()
                else -> Dog()
            }
        )
    }

    return animals
}