package io;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳을 여러 개 쓰고 [enter]를 누르세요");
        int i;
        try {
//            '\n' = 10; "\n" != 10은 불가 ""은 string
//            한글의 경우 2바이트씩 읽어야하는데 in은 한바이트씩만 읽기 때문에 한바이트씩 출력을 하면 정확하지 않음
            while ((i = System.in.read()) != '\n') {
                System.out.print(i);
                System.out.print((char) i);
            }
        } catch (IOException exception) {

        }
//        byte to string
        try {
            //System.in = keyboard와 연결된 InputStream;
            InputStreamReader irs = new InputStreamReader(System.in);
            while ((i = irs.read()) != '\n') {
                System.out.print(i);
                System.out.print((char) i);
            }
        } catch (IOException exception) {
        }
    }
}
