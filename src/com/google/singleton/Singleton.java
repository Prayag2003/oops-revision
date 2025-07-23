package com.google.singleton;

public class Singleton {

    private Singleton() {
        System.out.println("Only 1 object can be created.");
    }

    public static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

