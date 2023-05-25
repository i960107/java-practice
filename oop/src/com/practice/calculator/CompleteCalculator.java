package com.practice.calculator;

public class CompleteCalculator extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public float divide(int num1, int num2) {
        if (num2 == 0) {
            return ERROR;
        }
        return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모두 구현했습니다.");
    }

    @Override
    public void description() {
        System.out.println("complete calculator는 사칙연산을 모두 구현합니다.");
    }
}
