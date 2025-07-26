package com.google.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Act of representing an object in multiple forms

        // There are 2 types of polymorphism:
        // 1. Compile time/ static polymorphism (Method Overloading)
        // 2. Runtime polymorphism (Method Overriding)
        // Method Overloading: Same method name with different return types, parameters
        // (eg: Multiple constructors)
        // Method Overriding: Same method name in parent and child class

        Shapes shape = new Shapes();
        shape.area();

        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.area();
        square.area();
        triangle.area();

        Shapes s2 = new Circle();
        s2.area();
    }
}
