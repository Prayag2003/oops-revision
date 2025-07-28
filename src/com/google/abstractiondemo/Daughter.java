package com.google.abstractiondemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I will become a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
