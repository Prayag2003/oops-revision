package com.google.interfaces.nested;

public class A {
    // The nested interface can be public, private, protected or default but the
    // Outer class must be either public or default.
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}