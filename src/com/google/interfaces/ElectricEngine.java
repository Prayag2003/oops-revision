package com.google.interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("ElectricEngine played");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("ElectricEngine accelerate.");
    }
}