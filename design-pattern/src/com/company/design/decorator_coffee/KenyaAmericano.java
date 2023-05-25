package com.company.design.decorator_coffee;

public class KenyaAmericano implements Coffee{
    @Override
    public void brewing() {
        System.out.println("Kenya Americano Brewing");
    }
}
