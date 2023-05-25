package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
//            File file = new File("input.txt");
//            System.out.println(file.exists());
//            System.out.println(file.canRead());
            fis = new FileInputStream("input.txt");
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("here");
                e.printStackTrace();
            }
        }

        System.out.println("end");
    }
}
