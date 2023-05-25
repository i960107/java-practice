package com.practice.car;

public abstract class Car {
    int wheel;

    abstract void drive();

    abstract void stop();

    void startCar() {
        System.out.println("start car");
    }

    void turnoff() {
        System.out.println("turn off");
    }

    void wash() {
    }

    // 템플릿 메서드 역할.
    public final void run() {
        // //시나리오는 변하지 않음.
        startCar();
        drive();
        stop();
        turnoff();
        wash();
    }

}
