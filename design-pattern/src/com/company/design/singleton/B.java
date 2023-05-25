package com.company.design.singleton;

public class B {
    private SocketClient socketClient;

    public B() {
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
