package com.google.staticexample; 

// NOTE: Outside classes cannot be static
// static public class InnerClass{

public class InnerClass{
    // Test class depends on the InnerClass, 
    // so without static we cant directly create the object itself, since the Test class itself depends on the Innerclass's object
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("gpt");
        Test b = new Test("b");
    }
}
