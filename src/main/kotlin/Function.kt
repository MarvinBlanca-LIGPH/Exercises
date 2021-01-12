/**
Exercise: Functions
Design a function that asks for a user’s name. Then it asks for a user’s birth year.

Finally, it prints out a message saying the user’s name and age.

Call the function 3 times.
 */

fun main(args: Array<String>){
    for (i in 1..3) {
        askUser()
    }
}

fun askUser(){
    print("Please input your name: ")
    val name = readLine() ?: ""
    print("Please input your birth year: ")
    val input = readLine() ?: ""
    val age = 2020 - input.toInt()

    println("Hi $name you are $age")
}