package com.practice.customer2;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("sell order");
    }
}
