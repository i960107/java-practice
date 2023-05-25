package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        int i;
        try (FileInputStream fis = new FileInputStream("input2.txt")) {
            byte[] bytes = new byte[10];
            while ((i = fis.read(bytes)) != -1) {
                System.out.println(i);
                // alphabet 26자리: 마지막 블럭 출력될때는 6자리는 덮어쓰이고, 나머지 자리는 그대로 유지됨. UVWXYZQRST -> 버퍼에 자료 남아있음
                // 매번 클리어하는 것 보다, 읽어온 자료만큼만 사용하기
                // 왜 byte를 int로 받는게 가능하지? upcasting은 가능
                // 같은 크기의 경우 명시적으로 형변환 해주어야함.
                // int로 받아서 char로 출력하나 byte로 받아서 char로 출력하나 같음.
//                for (byte ch : bytes) {
//                    System.out.print(ch + " ");
//                    System.out.print(Integer.toBinaryString(ch) + " ");
//                    System.out.print((char) ch);
//                    System.out.println();
//                }
                for (int j = 0; j < i; j++) {
                    System.out.print((char) bytes[j]);
                }
                System.out.println();
            }
        } catch (IOException exception) {

        }
    }
}
