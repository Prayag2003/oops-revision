package com.google.polymorphism;

public class Shapes {
    // NOTE: Final methods cannot be overridden, thus prevents overriding.
    // final void area() {
    // System.out.println("This is the shape class!");
    // }
    void area() {
        System.out.println("This is the shape class!");
    }

    // NOTE: If we declare a class as final, it prevents inheritance as well as all
    // the methods of that class become implicitly final.

    // NOTE: Static methods cannot be overridden, but can be used in subclasses.
    static void staticMethod() {
        System.out.println("This is a static method in the Shape class!");
    }
}
