/**
 * Exercise: If conditional
You are designing a grading system for school exams. The total for an exam is 100 points, and you need to convert that into a grade A to F.

Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.

A -> 90 to 100
B -> 80 to 89
C -> 70 to 79
D -> 60 to 69
E -> 50 to 59
F -> everything else
 */

fun main(args: Array<String>) {
    print("Input student's grade (1 to 100): ")
    val input = readLine()
    val grade = input?.toInt() ?: 1

    val finalGrade = if (grade >= 90) {
        "A"
    } else if (grade >= 80) {
        "B"
    } else if (grade >= 70) {
        "C"
    } else if (grade >= 60) {
        "D"
    } else if (grade >= 50) {
        "E"
    } else {
        "F"
    }

    println("Final Grade is: $finalGrade")
}
