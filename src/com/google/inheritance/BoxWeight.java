package com.google.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        // used to initialize parent class's variables
        super(l, w, h); // NOTE: call the parent class constructor
        this.weight = weight;
    }
}