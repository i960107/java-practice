package com.company.design.decorator_coffee;

public class WhippingCream extends Decorator{
    public WhippingCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Whipping Cream");
    }
}
