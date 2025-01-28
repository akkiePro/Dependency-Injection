package com.no.dependency.injection;

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine(); // Car creates its own dependency (tight coupling)
    }

    public void start() {
        engine.run();
    }
}
