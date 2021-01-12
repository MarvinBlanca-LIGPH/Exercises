import java.lang.Exception

fun main(args: Array<String>) {
    val num = readLine()
    try {
        print(num?.toInt())
    } catch (e: Exception){
        println("An exception has occurred ${e.localizedMessage}")
    }
}