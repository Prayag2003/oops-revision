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
    }
}