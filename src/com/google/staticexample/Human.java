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
   static long population;

   // to access static variables, always use the "Class Name" since it belongs to 
   // the entire class
   // It can be created even when any object is not created.

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    @Override
    public String toString(){
        return "Details of " + this.name + " are:\n" 
        + "Age: " + this.age + "\n"
        + "Salary: " + this.salary + "\n"
        + "Married: " + this.married;
    }
}