package com.google.inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice() {
        super();
        this.price = 0.0;
        System.out.println("BoxPrice constructor called");
    }

    BoxPrice(double price) {
        this.price = price;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double length, double width, double height, double weight, double price) {
        super(length, width, height, weight);
        this.price = price;
    }

}
