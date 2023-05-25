package com.practice.calculator;

public class CalcMain {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Calc calculator = new CompleteCalculator();
        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.subtract(num1, num2));
        System.out.println(calculator.times(num1, num2));
        System.out.println(calculator.divide(num1, num2));
        //Calc타입이기 때문에 showiInfo()는 사용할 수 없음.

        calculator.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }
}
