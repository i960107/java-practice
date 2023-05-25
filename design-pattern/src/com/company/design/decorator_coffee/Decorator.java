package com.company.design.decorator_coffee;

//abstact 요소 없어도 상속만을 위한 상위클래스일 경우 abstract class만들기
public abstract class Decorator implements Coffee {
    private Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        //모든 하위 클래스에서 super.brewing()을 호출해 같은 동작 실행 후 추가 행동 실행
        coffee.brewing();
    }
}
