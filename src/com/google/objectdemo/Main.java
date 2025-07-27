package com.google.objectdemo;

public class Main {
    public static void main(String[] args) {
        Main mobj = new Main();
        Objectdemo obj1 = new Objectdemo();
        Objectdemo obj2 = new Objectdemo();

        System.out.println(obj1 == obj2);
        // gives a unique has value to each object
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        Objectdemo obj3 = obj1;
        // pointing to the same reference
        System.out.println(obj1.hashCode() == obj3.hashCode());

        // Equals
        Objectdemo ob1 = new Objectdemo(11);
        Object ob2 = new Objectdemo(11);
        if (ob1 == ob2) {
            System.out.println("Ob1 == Ob2");
        }
        if (ob1.equals(ob2)) {
            System.out.println("Ob1.equals(Ob2)");
        }

        // Instance Of
        System.out.println(ob1 instanceof Object);
        System.out.println(mobj instanceof Object);

        // GetClass()
        System.out.println(obj1.getClass());
    }
}

class Objectdemo extends Object {
    public int num;

    public Objectdemo() {
    }

    public Objectdemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((Objectdemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}