package com.google.inheritance;

public class Box {
    double l;
    double w;
    double h;
    double weight;

    public Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
        this.weight = 1000;
    }

    // Cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // rectangle
    Box(double len, double width, double height) {
        super();
        this.l = len;
        this.w = width;
        this.h = height;
        this.weight = 1000;
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