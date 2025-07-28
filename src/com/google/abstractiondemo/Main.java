package com.google.abstractiondemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(21);
        s.career();
        s.partner();

        Daughter d = new Daughter(18);
        d.career();
        d.partner();

        // TODO: 2
        // Objects of abstract cannot be created
        // REASON: Since if you create an object of the abstract class and try to access
        // its method, it would say its doesn't have a body, how can you call it
        // Parent mom = new Parent();

        // ====
        Parent.hello();
    }
}
