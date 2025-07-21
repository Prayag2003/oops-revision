package com.google.staticexample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once when the class is loaded first time/ first object is created
    static {
        System.out.println("Inside Static Block");
        System.out.println("This will get run only once at the start of the class");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        // the static method wont run again
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}