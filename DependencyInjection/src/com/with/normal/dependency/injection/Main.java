package com.with.normal.dependency.injection;

public class Main {
    public static void main(String[] args) {
        Engine engine = new TurboEngine(); // Dependency created externally
        Car car = new Car(engine);   // Injecting dependency
        car.start();
    }
}
