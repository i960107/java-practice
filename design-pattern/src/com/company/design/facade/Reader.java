package com.company.design.facade;

public class Reader {
    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileOpen() {
        String msg = String.format("Reader %s로 연결합니다.", fileName);
        System.out.println(msg);
    }

    public void fileRead() {
        String msg = String.format("Reader %s의 내용을 읽어 옵니다.", fileName);
        System.out.println(msg);
    }

    public void fileClose() {
        String msg = String.format("Reader %s로 연결종료합니다.", fileName);
        System.out.println(msg);
    }
}
