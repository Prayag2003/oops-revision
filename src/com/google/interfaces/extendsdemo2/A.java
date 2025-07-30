package com.google.interfaces.extendsdemo2;

public interface A {
    default void func() {
        System.out.println(
                "Default was introduced so in case multiple classes implements this interface, not everyone has to implement this method's body");
    };
}
