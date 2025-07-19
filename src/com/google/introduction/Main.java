package com.google.introduction;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
         int [] numbers = new int[5];
         String [] names = new String[5];

         // combine them into a single entity => Class
         // Class is a named group of properties and methods.
        Student []students = new Student[5];  

        // DOT operator can be used to access the instance variables.
        Student google;
        // System.out.println(google.marks); ERROR: variable google might not have been initialized

        System.out.println(Arrays.toString(students));

        // NEW KEYWORD: Dynamically allocate memory at runtime and returns a reference to the object.
        // the reference is stored in stack memory, and actual object is stored in heap memory.

        // All objects has to be created dyanamically in heap memory.
        // Student student1  => happens at compile time, no memory is allocated.
        // = new Student(); => happens at runtime, memory is allocated in heap.
        Student s = new Student();
        System.out.println("memory of student s" + s); 

    }
}


// create a class
// just a template/ blueprint => LOGICAL CONSTRUCT
// instance of a class = object => PHYSICAL REALITY
class Student {
    int rno;
    String name;
    int marks;


    // Constructor is a special function that is always called when an object is created.
    // It is used to initialize the instance variables of the class. It binds the arguments to the instance variables.
    // Types of constructors:
    // 1. Default constructor: No arguments, initializes instance variables to default values.
    // 2. Parameterized constructor: Takes arguments to initialize instance variables with specific values.
    Student(){
        // this keyword refers to the current object. Whoever calls the constructor, that object is referred by this keyword.
        this.rno = 0;
        this.name = "Unknown";
        this.marks = 0;
    }

    Student(int rno, String name, int marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Student(){
    ////   in this case, the this is replaced with the class name.
    //     this(1, "default constructor called from no-arg constructor", 0);
    // }

}
