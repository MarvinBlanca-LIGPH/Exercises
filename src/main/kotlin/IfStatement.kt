/**
 * Exercise: If statement
Define two variables

val hasEggs = true
val hasBacon = false
A man goes to the market. His instructions are:

If you find eggs, buy 12

If you buy eggs, and you also find bacon, buy two packs

Eggs cost 5 each.
A pack of bacon costs 20.
How much does the man spend at the market?


 */
fun main(args: Array<String>) {
    val hasEggs = true
    val eggCost = 5
    val hasBacon = false
    val baconCost = 20
    var total = 0

    if (hasEggs) {
        total += (12 * eggCost)
        if (hasBacon) {
            total += baconCost.times(2)
        }
    }

    println("Total price is: $total")
}