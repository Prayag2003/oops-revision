package com.google.polymorphism;

public class Circle extends Shapes {
    @Override
    void area() {
        System.out.println("Area of Circle is πr²");
    }

    // @Override
    // Method Hiding
    // This is not an override, it's method hiding because static methods are not
    // polymorphic.
    static void staticMethod() {
        System.out.println("This is a static method in the Circle class!");
    }

    public static void main(String[] args) {
        Shapes.staticMethod();
        Shapes circle = new Circle();
        // This will call the static method from Shapes, not Circle, why?
        // Because static methods are resolved at compile time based on the reference
        // type.
        circle.staticMethod();

        Circle c = new Circle();
        // this will call the static method from Circle, why?
        // Because static methods are resolved at compile time based on the reference
        // type.
        c.staticMethod();
    }
}
