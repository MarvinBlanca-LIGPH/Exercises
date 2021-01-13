/**
Exercise: Logical operators
A farmer has 3 cows, of which only one produces milk

He has two children

He is trying to apply for funding. The requirements are

You must have no more than 5 animals

Animals must produce something that can be sold

Regardless of the other conditions, funding will be approved if the family has 3 or more members

Does the farmer receive the funding?
 */

fun main(args: Array<String>) {
    val cowCount = 3
    val milkCount = 1
    val childCount = 2

    val result = (cowCount <= 5 && milkCount > 0) || (childCount + 1 >= 3)

    print("Will the farmer receive funding? $result")
}