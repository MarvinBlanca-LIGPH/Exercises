package tryCatch

import java.lang.Exception

fun main(args: Array<String>){

    val fixPrice = 9.99

    print("Please input the product you want to purchase: ")
    val product = readLine()
    print("Please input the quantity: ")
    val quantity = readLine()

    try {
        val total = quantity?.toInt()?.times(fixPrice)
        println("Total amount for $quantity $product is $total")
    } catch (e: Exception){
        println("$quantity is not a valid quantity value")
        e.printStackTrace()
    } finally {
        println("Next customer please!")
    }
}