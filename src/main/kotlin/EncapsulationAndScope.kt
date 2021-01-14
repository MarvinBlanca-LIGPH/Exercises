/**
Exercise: Encapsulation and scope
A famous fast food restaurant has a secret formula for their burgers.

A franchise of this brand can sell burgers, but does not have access to the formula. They have to ask the original restaurant how to prepare the food.

Implement this in a program, and call the franchise object to provide you with burgers.
 */

fun main(args: Array<String>) {
    val franchise = Franchise()
    franchise.prepareBurger()
}

open class OriginalRestaurant {
    protected fun applySecretFormula(): String = "Burger prepared with secret formula."
}

class Franchise : OriginalRestaurant() {
    fun prepareBurger() {
        println("Asking for secret formula from original restaurant.")
        println(applySecretFormula())
    }
}