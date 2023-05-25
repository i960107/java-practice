package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    // 파일에 한바이트씩 쓰기
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output1.txt")) {
            //file 은 무조건 byte를 char로 해석한다..?
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (IOException exception) {

        }
        System.out.println("출력이 완료되었습니다.");

    }

}
