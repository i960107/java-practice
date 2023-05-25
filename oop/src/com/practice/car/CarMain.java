package com.practice.car;

public class CarMain {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
