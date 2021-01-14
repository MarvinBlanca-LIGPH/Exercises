/**
Exercise: Inheritance
A class Job has three variables, name, revenue and salary, and two methods,
work - which increases revenue by the amount in salary
study - which increases salary

Two classes, Engineer and Doctor inherit from the Job class, but have different values for salary.

Create objects and call the functions a few times, printing out messages to see the result of the functions.
 */

fun main(args: Array<String>) {
    val doctor = Doctor()
    val engineer = Engineer()

    doctor.name = "Dr. Uy"
    doctor.revenue = 10000
    doctor.salary = 60000

    engineer.name = "Engr. Yu"
    engineer.revenue = 5000
    engineer.salary = 45000

    doctor.study()
    doctor.study()
    doctor.study()
    doctor.study()
    doctor.study()
    doctor.work()

    println()

    engineer.study()
    engineer.work()
    engineer.work()
    engineer.study()
    engineer.work()
}

open class Job {
    var name = ""
    var revenue = 0
    var salary = 0
    var studyBonus = 8000

    fun work() {
        revenue += salary
        println("$name's revenue is: $revenue")
    }

    fun study() {
        salary += studyBonus
        println("$name's salary is: $salary")
    }
}

class Doctor : Job()
class Engineer : Job()