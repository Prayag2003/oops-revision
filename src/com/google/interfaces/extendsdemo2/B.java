package com.google.interfaces.extendsdemo2;

public interface B {

    // static methods must be implemented since the static methods cannot be
    // inherited, so it must be implemented
    static void greet2() {
        System.out.println("Static interface methods be implemented");
    }

    void greet();
}
