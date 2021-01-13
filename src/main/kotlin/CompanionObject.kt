/**
Exercise: Companion object
A book class will provide information about the editor without the need to be instantiated.

It will also require this information - in the form of an editor object type - in the constructor.

Implement this in a program.
 */

fun main(args: Array<String>) {
    val book = Book(Book.getEditorInfo())
    println(book.editorInfo.editorInfo)
    println(Book.getEditorInfo().editorInfo)
}

class Book(val editorInfo: Editor) {
    companion object {
        fun getEditorInfo() = Editor("Romain Guy")
    }
}

class Editor(val editorInfo: String)