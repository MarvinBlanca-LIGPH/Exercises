/**
 * Exercise: Set functions
Your company has very strict dress code. Only certain color clothes can be worn in the office.

val acceptedColors = hashSetOf(“white”, “black”, “grey”)

You have certain colors in your wardrobe.

val myColors = hashSetOf(“blue”, “red”, “black”, “green”)

What color clothes can you wear.

Your company has added another color, “red” to their list. What options do you have now?
 */
fun main(args: Array<String>) {
    val acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")
    var holder = acceptedColors

    holder.retainAll(myColors)
    println("You can only wear: $holder")

    acceptedColors.add("red")
    holder = acceptedColors
    holder.retainAll(myColors)
    println("You can now wear: $holder")
}