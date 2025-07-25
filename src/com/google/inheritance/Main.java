package com.google.inheritance;

public class Main {
    public static void main(String[] args) {
        Box defaultBox = new Box();
        System.out.println(defaultBox.h + " " + defaultBox.w + " " + defaultBox.l);

        Box cube = new Box(4);
        System.out.println(cube.h + " " + cube.w + " " + cube.l);

        Box cuboid = new Box(10, 11, 12);
        System.out.println(cuboid.h + " " + cuboid.w + " " + cuboid.l);
    }
}