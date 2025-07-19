package com.google.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    /* 
        Static properties: Such properties which are OBJECT INDEPENDENT and are common to all
        the objects of that class are called as @static, eg: population
    */

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
    }

    @Override
    public String toString(){
        return "Details of " + this.name + " are:\n" 
        + "Age: " + this.age + "\n"
        + "Salary: " + this.salary + "\n"
        + "Married: " + this.married;
    }
}