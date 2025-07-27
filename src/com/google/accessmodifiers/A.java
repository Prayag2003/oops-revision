package com.google.accessmodifiers;

public class A {
    private int size;
    String name;
    int[] arr;

    // getter setter for private variables
    public int getSize() {
        return this.size;
    }

    public void setSize(int _size) {
        this.size = _size;
    }

    public A(int size, String name) {
        this.size = size;
        this.name = name;
        this.arr = new int[size];
    }
}
