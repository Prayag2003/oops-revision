package com.google.polymorphism;

public class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        // figures out at the compile time only, thus static
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.sum(1, 2, 4));
        System.out.println(obj.sum(0.05f, 1.0f));

        // Runtime/ Dynamic Polymorphism
        // achieved by method overriding
        // if type of the reference is of "Parent" class and the object is of the
        // "subclass"

        // NOTE: Reference tells what can be accessed && Object decides which method
        // should be called

        // IMPORTANT: UPCASTING
        // Parent obj = new Child();

        // DYNAMIC METHOD DISPATCH: At runtime, the method to be called is determined by
        // the actual object type and not the reference type.
        Shapes c = new Circle();
        c.area();
    }
}
