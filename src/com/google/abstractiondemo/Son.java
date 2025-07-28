package com.google.abstractiondemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
        // this.age = age;
    }

    @Override
    void career() {
        System.out.println("I will become a coder");
    }

    @Override
    void partner() {
        System.out.println("I love pepper potts");
    }

    @Override
    void normal() {
        System.out.println("Normal method overridden in the child class");
    }
}
