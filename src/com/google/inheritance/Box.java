package com.google.inheritance;

public class Box {
    double l;
    double w;
    double h;

    public Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // Cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // rectangle
    Box(double len, double width, double height) {
        this.l = len;
        this.w = width;
        this.h = height;
    }

    // copy constructor
    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information() {
        System.out.println("Running the box...");
    }
}