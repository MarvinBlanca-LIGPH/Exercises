/**
 * Exercise: Set and HashSet
You have a list of customers for your online store.

A new customer has joined.

Print the list of customers.

A customer has chosen to leave.

Print the list of customers.


 */
fun main(args: Array<String>) {
    val customers = hashSetOf("Mark", "Marvin", "Blanca")
    customers.add("Mirasol")
    println(customers)

    customers.remove("Mark")
    println(customers)
}