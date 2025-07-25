package com.google.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        // used to initialize parent class's variables
        super(l, w, h); // NOTE: call the parent class constructor
        this.weight = super.weight;

        // can also use super.height to access to parent class's variables
        // same can be done via this.height
        // only thing where we should super is to access the parent's var since the
        // parent as well as the child can have the same variable, lets say "weight"
    }
}