/**
Exercise: Extension functions
Add an extension function to the ArrayList class that returns a message saying how many elements the list contains.

Create an ArrayList and print out the extension function message.
 */

fun main(args: Array<String>) {
    val arrayList = arrayListOf("Hi", "How", "Are", "You", "?", "Zzz")

    println(arrayList.getArraySize())
}

fun ArrayList<String>.getArraySize() = "The size of the list is: $size"