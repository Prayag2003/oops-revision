package com.google.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        // used to initialize parent class's variables
        // NOTE: The superclass needs to be initialized before the subclass can safely
        // use its
        // fields or methods.
        // Java enforces this to ensure proper object construction order.
        super(l, w, h); // NOTE: call the parent class constructor
        this.weight = weight;

        // can also use super.height to access to parent class's variables
        // same can be done via this.height
        // only thing where we should super is to access the parent's var since the
        // parent as well as the child can have the same variable, lets say "weight"
    }
}