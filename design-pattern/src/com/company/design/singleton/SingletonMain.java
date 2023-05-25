package com.company.design.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        A aClazz = new A();
        B bClazz = new B();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
