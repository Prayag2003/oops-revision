package com.google.inheritance;

public class Main {
    public static void main(String[] args) {
        Box defaultBox = new Box();
        System.out.println(defaultBox.h + " " + defaultBox.w + " " + defaultBox.l);

        Box cube = new Box(4);
        System.out.println(cube.h + " " + cube.w + " " + cube.l);

        Box cuboid = new Box(10, 11, 12);
        System.out.println(cuboid.h + " " + cuboid.w + " " + cuboid.l);

        BoxWeight bw1 = new BoxWeight();
        System.out.println(bw1.h + " " + bw1.weight);

        BoxWeight bw2 = new BoxWeight(2, 3, 4, 10);
        System.out.println(bw2.h + " " + bw2.l + " " + bw2.w + " " + bw2.weight);

        // Parent can never access child's variables. Only the child/derived class can
        // acccess the parent's public or protected variables

        // IMPORTANT: It is the reference type and not the object type that determines
        // what instance variables can be accessed
        Box boxi = new BoxWeight(1, 2, 3, 4);
        // System.out.println(boxi.weight); // ERROR
        System.out.println(boxi.h);

        // IMPORTANT:
        // BoxWeight box2 = new Box(1, 2, 3);
        System.err.println(
                "Will throw error since the reference type Box2 should be able to access it's property, i.e, weight, and to access it, it must instantiate that variable too, but the Box class does'nt have access to that variable itself");

        // IMPORTANT: Super Keyword is used to call the constructor of it's parent class
        // and it's parent class can call the constructor of its own parent class and so
        // on. But every class has it's super pointing to the "OBJECT" class.

        // NOTE: can also use super.height to access to parent class's variables (refer
        // BoxWeight's Constructor)
        // same can be done via this.height
        // only thing where we should super is to access the parent's var since the
        // parent as well as the child can have the same variable, lets say "weight"
        System.out.println(bw1.weight);
        System.out.println(bw2.weight);

        // EXPERIMENTING: with multi-level inheritance
        BoxPrice bp1 = new BoxPrice();
        System.out.println("Weight from default constructor is " + bp1.price);

        BoxPrice bp2 = new BoxPrice(bp1);
        System.out.println("Weight from default constructor is " + bp2.price);
        System.out.println("Weight from default constructor is " + bp2.weight);

        BoxWeight bp3 = new BoxPrice();
        // System.out.println(bp3.price); // error

        Box bp4 = new BoxPrice();
        // System.out.println(bp4.price);
    }
}