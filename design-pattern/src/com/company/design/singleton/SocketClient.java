package com.company.design.singleton;

public class SocketClient {
    private static SocketClient instance;

    private SocketClient() {

    }

    public static SocketClient getInstance() {
        if (instance == null) {
            instance = new SocketClient();
        }
        return instance;
    }

    public void connect() {
        System.out.println("connect");
    }
}
