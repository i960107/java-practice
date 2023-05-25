package com.practice.customer;

public class Customer {
    private final int id;
    private final String name;
    protected final String grade;
    protected final double bonusRatio;
    protected int bonusPoint;

    public Customer(int id, String name) {
//        System.out.println("customer constructor");
        this.id = id;
        this.name = name;
        grade = "Silver";
        bonusRatio = 0.01;
    }

    public String getName() {
        return name;
    }

    public Customer(int id, String name, String grade, double bonusRatio) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.bonusRatio = bonusRatio;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String getCustomerInfo() {
        return String.format("%s님의 등급은 %s이며, 보너스 포인트는 %d 입니다.", name, grade, bonusPoint);
    }
}
