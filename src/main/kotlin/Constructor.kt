/**
Exercise: Constructors
Create an online store user account class that has a userName and balance

Create 3 constructors for this class.

Inside the constructors, based on the user balance, print out whether they can afford the product tshirt, which costs 20, and if so, how many can they afford.
 */

fun main(args: Array<String>) {
    val firstUser = Users()
    val secondUser = Users("Juan")
    val thirdUser = Users("Marvin", 56789)
}

class Users {
    var userName = ""
    var balance = 0
    private val shirtPrice = 20

    constructor() {
        userName = "Testing"
        balance = 0
        canAfford()
    }

    constructor(userName: String) {
        this.userName = userName
        canAfford()
    }

    constructor(userName: String, balance: Int) {
        this.userName = userName
        this.balance = balance
        canAfford()
    }

    private fun canAfford() {
        if (balance >= 20) {
            println("$userName you can purchase ${balance / shirtPrice} shirts, and your new balance would be ${balance % shirtPrice}")
        } else {
            println("Insufficient funds !!!")
        }
    }
}