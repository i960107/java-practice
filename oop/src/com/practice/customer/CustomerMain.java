package com.practice.customer;

public class CustomerMain {
    public static void main(String[] args) {
        // upcasting
//        Customer vc = new VIPCustomer(21345, "no-name");
//        System.out.println(vc.calcPrice(1000));

//        ArrayList<Customer> customers = new ArrayList<>();
//        customers.add(new Customer(10001, "kim"));
//        customers.add(new Customer(10002, "yun"));
//        customers.add(new GoldCustomer(10003, "hong"));
//        customers.add(new GoldCustomer(10004, "han"));
//        customers.add(new VIPCustomer(10005, "son"));
//
//        for (Customer customer : customers) {
//            System.out.println(customer.getCustomerInfo());
//        }
//
//        int price = 10000;
//        for (Customer customer : customers) {
//            System.out.println(String.format("%s님이 %d원 지불하셨습니다.", customer.getName(), customer.calcPrice(10000)));
//            System.out.println(String.format("%s님의 현재 보너스 포인트는 %d입니다", customer.getName(), customer.bonusPoint));
//        }

        Customer kim = new GoldCustomer(21345, "kim");
        System.out.println(kim instanceof Customer); // true
        System.out.println(kim instanceof GoldCustomer); //true
//        VIPCustomer vc = (VIPCustomer) kim; // 컴파일전까지 오류 메세지 안남. 인텔리제이는 형까지는 알지 못함. 형변환하는 타입이 맞는지만 체크함.
        GoldCustomer gc = (GoldCustomer) kim;
        System.out.println(gc instanceof Customer); //true
        System.out.println(gc instanceof GoldCustomer); //true
    }
}
