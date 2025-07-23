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

   // Static method cannot refer to this or super keyword
   // NOTE: We cannot use "this" keyword inside the static methods
   static void message(){
    System.out.println("hello world");
    // System.out.println(this.age); ERROR 
   }

   // to access static variables, always use the "Class Name" since it belongs to 
   // the entire class
   // It can be created even when any object is not created.

   // NOTE: Static methods are resolved at compile time since they are not dependent on objects.

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        Human.message();
    }

    @Override
    public String toString(){
        return "Details of " + this.name + " are:\n" 
        + "Age: " + this.age + "\n"
        + "Salary: " + this.salary + "\n"
        + "Married: " + this.married;
    }
}