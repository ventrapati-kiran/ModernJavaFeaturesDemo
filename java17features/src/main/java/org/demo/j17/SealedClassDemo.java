package org.demo.j17;

/**
 * Java 17 Sealed Class Demo
 * Sealed classes allow restricting which classes can extend or implement a class or interface.
 */
public class SealedClassDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Square Area: " + square.area());
    }
}

// Sealed class Shape
sealed abstract class Shape permits Circle, Rectangle, Square {
    abstract double area();
}

// Subclass Circle
final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
final class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Subclass Square
final class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}