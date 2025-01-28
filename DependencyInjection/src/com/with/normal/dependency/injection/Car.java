package com.with.normal.dependency.injection;

class Car {
    private Engine engine;

    // Engine is injected through the constructor (loose coupling)
    // NOTE: we never know which dependency will come. it could be either TurboEngine OR NormalEngine.
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.run();
    }
}
