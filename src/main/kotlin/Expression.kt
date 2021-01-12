/**
Exercise: Expressions
Ask a user to input their age.

If they are under 13, they are a child
If they are under 18, they are a teen
If they are older, they are an adult.

Use ranges to print out the correct message.

If the age is 0, convert it to 1.
 **/
fun main(args: Array<String>) {
    print("Please input your age: ")
    val input = readLine() ?: "1"
    val age = if (input.toInt() == 0) 1 else input.toInt()

    val category = if (age in 1..12) "a child"
    else if (age in 13..17) "a teen"
    else "an adult"

    println("You are categorized as $category")
}