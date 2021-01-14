/**
Exercise: Operators
Read from the console the amount the user has in their bank account.

The interest on that account is 5.5% per year.

How much would that user have in 5 years?
 */

fun main(args: Array<String>) {
    print("Please input your current bank account balance: ")
    val input = readLine() ?: "1000.00"

    val amount = input.toInt() * 1.055 * 1.055 * 1.055 * 1.055 * 1.055

    println("Your balance will be $amount in 5 years time.")
}