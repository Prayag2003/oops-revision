package com.google.staticexample;

public class Main{
    public static void main(String[] args) {
        /**
         * Main method has to be static:
         * Reason: The main method is the entry point of the Java application.
         * If it's not static, the JVM cannot call it without creating an instance of the class.
         * And to create an instance, the JVM would need to know how to call the constructor,
         * which would create a circular dependency.
         * By making it static, the JVM can call it directly without needing an instance.
         */

        Human chatgpt = new Human(10, "Chat GPT", 1_00_000, false);
        Human groq = new Human(4, "Groq", 3_00_000, false);
        Human claude = new Human(8, "Claude", 5_00_000, false);

        System.out.println(chatgpt.toString());
        System.out.println(groq.population);
        System.out.println(claude.population);

        /* 
            cannot use a non-static method inside a static one since non-static 
            belongs to an instance while the static doesn't
            But there can be a static inside a non-static method
        */
        greeting();
    }

    // non-static method
    // void greeting(){}
    
    static void greeting(){
        System.out.println("Greetings from greeting function.");
    }
}