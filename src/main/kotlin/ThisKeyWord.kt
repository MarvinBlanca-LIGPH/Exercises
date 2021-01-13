/**
Exercise: The 'this' keyword
A table allows the user to adjust the height and size, through a function that also takes the parameters height and size.

Create the class, variable, function, instantiate it and call the function to adjust height and size.
 */

fun main(args: Array<String>) {
    val table = Table()
    table.printTableInfo()
    table.updateTable(250, 250)
    table.printTableInfo()
}

class Table {
    var height = 20
    var size = 20

    fun updateTable(height: Int, size: Int) {
        this.height = height
        this.size = size
    }

    fun printTableInfo() = println("The table is $height in height and $size in size.")
}