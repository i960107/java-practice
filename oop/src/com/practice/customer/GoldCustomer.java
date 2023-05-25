package com.practice.customer;

public class GoldCustomer extends Customer {
    private final double salesRatio;

    public GoldCustomer(int id, String name) {
        super(id, name, "GOLD", 0.02);
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }
}
