package com.google.interfaces;

public class Main {
    // NOTE: The variables are final and static by default since interfaces cant
    // have objects.
    // Final since the interface doesn't have a constructor and thus variables cant
    // be initiated, thus final.
    // Helps in multiple inheritance
    // The methods are abstract in nature

    // IMPORTANT: Abstract class can provide the implementation of interface but not
    // vice versa

    public static void main(String[] args) {
        Engine c = new Car();
        c.start();
        c.stop();
        c.accelerate();

        // TODO: 1
        // this would use the same start engine method, so basically if you stop the
        // music, well the engine would stop 🤣
        // Solution: Create seperate classes for this interface as well!
        Media m = new Car();
        m.start();
        m.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        niceCar.stop();

        niceCar.upgradeEngine();
        niceCar.start();
    }
}
