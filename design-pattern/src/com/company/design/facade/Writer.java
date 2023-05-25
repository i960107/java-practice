package com.company.design.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileOpen() {
        String msg = String.format("Writer %s로 연결합니다.", fileName);
        System.out.println(msg);
    }

    public void fileWrite() {
        String msg = String.format("Writer %s의 내용을 읽어 옵니다.", fileName);
        System.out.println(msg);
    }

    public void fileClose() {
        String msg = String.format("Writer %s로 연결종료합니다.", fileName);
        System.out.println(msg);
    }
}
