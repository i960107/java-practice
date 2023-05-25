package com.practice.customer2;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = new Customer();
        buyer.order();
        //buyer.hello(); 불가능

    }
}
