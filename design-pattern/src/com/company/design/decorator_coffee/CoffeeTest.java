package com.company.design.decorator_coffee;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee etiopiaCoffee = new EtiopiaAmericano();
        etiopiaCoffee.brewing();

        System.out.println();
        Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
        etiopiaLatte.brewing();

        System.out.println();
        Coffee mocha = new Mocha(new Latte(new EtiopiaAmericano()));
        mocha.brewing();

        System.out.println();
        Coffee kenya = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
        kenya.brewing();
    }
}
