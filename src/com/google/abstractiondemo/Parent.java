package com.google.abstractiondemo;

public abstract class Parent {

    int age;

    // TODO:1 can we create an abstract constructor?
    public Parent(int age) {
        this.age = age;
    }

    abstract void career();

    abstract void partner();

    // TODO: 3
    // Q: Can we create abstract constructors:
    // NO
    // Since objects cant be created from the abstract class
    // abstract Parent();

    // TODO: 4
    // Can we create abstract static methods:
    // NO
    // Reason: Do static methods do get overridden? No, since its object
    // independent. And abstract class needs to be overridden, so doesn't make sense
    // to create abstract static method.
    // Yes, but we can create static methods inside abstract class
    static void hello() {
        System.out.println("Hello");
    }

    // TODO: 5
    // Q. Can the abstract class have normal methods:
    void normal() {
        System.out.println("I am normal!");
    }
}
