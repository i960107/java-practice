package com.company.design.decorator_car;

public class AudiDecorator implements Icar {
    protected Icar audi;
    protected int modelPrice;
    protected String modelName;

    public AudiDecorator(Icar audi, String modelName, int modelPrice) {
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return audi.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + "의 가격은 " + getPrice() +"입니다.");

    }
}
