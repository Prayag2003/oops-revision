public class WrapperExample {
    public static void main(String[] args) {
        // Primitives are stored in stack memory.
        // Wrapper classes are used to convert primitives into objects.
        // Wrapper classes are part of java.lang package.
        // They are used to create objects from primitive types.
        int a = 10; // will get stored in stack memory only
        
        // Wrapper class for int is Integer
        Integer b = 45; // created like an object

        swap(a, b);
        // Final keyword are not modifiable. Therefor always initialized. 
        // Final gurantees immutability for only Primitives, not for objects.
        // For objects, final means that the reference cannot be changed, but the object values can be modified.
        
        // Example:
        // final Integer c = 20; // cannot change the reference
        // c = 30; // ERROR: cannot assign a value to final variable c
        
        // However, you can change the value of the object that c refers to.
        // Integer d = new Integer(30); // this is allowed, but not recommended.
        // final Integer e = new Integer(40); // this is allowed, but not recommended
        // e = new Integer(50); // ERROR: cannot assign a value to final variable
        // final Integer f = 60; // this is allowed, but not recommended

        // NOTE: When a non-primitive is final, you cannot reassign it.

        final int bonus = 5;
        // bonus = 10; // ERROR: cannot assign a value to final variable bonus

        // Finalize method is used to perform cleanup operations before an object is garbage collected.
        // It is called by the garbage collector when it determines that there are no more references to
        // the object. It is used to release resources or perform any necessary cleanup.
        // It is not guaranteed to be called immediately after the object is no longer reachable.
        A obj = new A("example");
        for (int i = 0; i < 10000000; i++) {
            obj = new A("example" + i);
        }

    }
    static void swap(Integer x, Integer y) {
        // This will not swap the values because x and y are references to Integer objects.
        // The swap will not affect the original variables in the main method.
        Integer temp = x;
        x = y;
        y = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("Constructor called for " + name);
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}