package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        //a.zip파일을 복사하기
        long millisecond = 0;
        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream("a.zip"));
             BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("copy_a.zip"));
        ) {
            millisecond = System.currentTimeMillis();
            int i;
            //byte or int -1
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println(millisecond + "소요됨");

        Socket socket = new Socket();
        //byte 단위로 받기 때문에 영어만 가능
//        socket.getInputStream().read();
        //한글을 속도 빠르게 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        br.read();
        //bufferedReader만 readLine()을 통해 newLine까지 읽기 가능.
        br.readLine();
    }
}
