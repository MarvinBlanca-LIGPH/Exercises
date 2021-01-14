/**
Exercise: Getters and Setters
A bank has various rules for interest rates.

If a user has less than 1000 in their account, their interest rate is 1.0

If a user has less than 10.000 in their account, their interest rate is 0.5

If a user has 10000 and over, their interest rate is 0.2.

Implement this in a program, create an object, update the amount and print out the interest rate.
 */

fun main(args: Array<String>) {
    val interestCalculator = InterestCalculator()
    interestCalculator.balance = 1500
    interestCalculator.balance = 900
    interestCalculator.balance = 15000
    interestCalculator.balance = 1000
}

class InterestCalculator {
    private var interestRate = 0.0

    var balance = 0
        set(value) {
            interestRate = when {
                value < 1000 -> {
                    1.0
                }
                value < 10000 -> {
                    0.5
                }
                else -> {
                    0.2
                }
            }
            field = value
            println("Your balance $value has an interest rate of $interestRate")
        }
}