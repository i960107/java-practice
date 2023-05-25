package com.company.design.facade;

public class FacadeMain {
    public static void main(String[] args) {
        // 클라이언트가 다 의존성을 가지고 있음.
//        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileOpen();
//        writer.fileWrite();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileOpen();
//        reader.fileRead();
//
//        writer.fileClose();
//        reader.fileClose();
//        ftpClient.disconnect();
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();
    }
}
