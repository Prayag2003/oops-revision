package com.google.interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Music played");
    }

    @Override
    public void stop() {
        System.out.println("Music player stopped.");
    }
}