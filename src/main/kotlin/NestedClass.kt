/**
Exercise: Nested classes
In order for an airplane to take off, it needs to have 2 engines, and they both need be running.

Create an Airplane class that has a takeoff method, which starts the engines and prints a take off message.
 */

fun main(args: Array<String>) {
    val airplane = Airplane()
    airplane.takeOff()
}

class Airplane {

    private val engine1 = Engine(1000)
    private val engine2 = Engine(1001)

    fun takeOff() {
        println("Starting Engines for take off")
        engine1.startEngine()
        engine2.startEngine()
        println("All engines ready. Taking off!!!")
    }

    inner class Engine(val engineNumber: Int) {
        fun startEngine() {
            println("Starting Engine number$engineNumber.")
        }
    }
}