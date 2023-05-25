package com.practice.singleton;

public class CarFactory {
    private static CarFactory instance;
    private CarFactory(){}

    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        return new Car();
    }
}
