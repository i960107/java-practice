package com.company.design.decorator_car;

public class Audi implements Icar {
    private int price;

    public Audi(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void showPrice() {
        System.out.println("audi의 가격은 " + this.price + "원 입니다.");
    }
}
