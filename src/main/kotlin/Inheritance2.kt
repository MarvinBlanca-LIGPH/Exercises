/**
A class Father has a first name and last name. It also has a function that prints out the person’s name.

A class Son inherits from Father and overrides the first name. It also overrides the message function,
which now prints out both the name of the person, and the name of the father.

Implement this structure in a program.
 */

fun main(args: Array<String>) {
    val person = Son("John")
    person.printName()
}

open class Father {
    open val firstName = "Juan"
    val lastName = "De La Cruz"

    open fun printName() {
        println("Son's name is $firstName $lastName")
    }
}

class Son(name: String) : Father() {
    override val firstName = name

    override fun printName() {
        super.printName()
        println("Father's name is ${super.firstName} ${super.lastName}")
    }
}