package com.company.design.singleton;

public class A {
    private SocketClient socketClient;
    public A(){
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
