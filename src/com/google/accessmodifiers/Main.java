package com.google.accessmodifiers;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Array");
        // System.out.println(obj.size); // cant access private variables
        obj.getSize();
    }
}
