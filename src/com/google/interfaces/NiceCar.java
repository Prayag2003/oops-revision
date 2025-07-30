package com.google.interfaces;

public class NiceCar {
    private Engine engine;

    private Media player;

    public NiceCar() {
        this.engine = new PowerEngine();
        this.player = new CDPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
        this.player = new CDPlayer();
    }

    // Modify attributes
    public void changeCDPlayer(Media player) {
        this.player = player;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }

    // Media Player
    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }
}
