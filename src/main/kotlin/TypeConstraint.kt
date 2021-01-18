/**
Exercise: Type constraints
Create an abstract class Shape that defines a method getArea which takes an argument size.
Create two subclasses, Square and Circle, that inherit from Shape, and implement the method.

Square area = size * size

Circle area = size * size * 3.1415

Create another class Geometry that takes a generic argument of type Shape,
and has a method that prints a message which includes the area of the shape that is passed.

Instantiate the Geometry class and print the area of the shape.
 */

fun main(args: Array<String>) {
    val square = Geometry<Square>()
    val circle = Geometry<Circle>()

    square.calculateArea(Square(), 20)
    square.calculateArea(Square(), 15)

    circle.calculateArea(Circle(), 5)
    circle.calculateArea(Circle(), 10)
}

abstract class Shape {
    abstract fun getArea(size: Int): Double
}

class Square : Shape() {
    override fun getArea(size: Int) = size * size.toDouble()
}

class Circle : Shape() {
    override fun getArea(size: Int) = size * 3.1415
}

class Geometry<T : Shape> {
    fun calculateArea(item: T, size: Int) {
        println("The area of this shape is: ${item.getArea(size)}")
    }
}