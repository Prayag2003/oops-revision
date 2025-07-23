package com.google.singleton;

public class Main{
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.err.println(obj1.toString());
        System.err.println(obj2.toString());
    }
}