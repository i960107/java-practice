package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    // byte[] 배열에 A-Z까지 넣고 배열을 한꺼번에 파일에 쓰기
    public static void main(String[] args) throws FileNotFoundException {
//        byte[] bytes = new byte[26];
//        try (FileOutputStream fos = new FileOutputStream("output2.txt")) {
//            for (byte c = 'A'; c <= 'Z'; c++) {
//                bytes[c - 'A'] = c;
//            }
//            fos.write(bytes);
//        } catch (IOException exception) {
//
//        }

        //java 9부터 제공
        FileOutputStream fos = new FileOutputStream("output.txt");
        try(fos){
            byte data = 65;
            byte[] bytes = new byte[26];
            for(int i = 0; i<26; i ++){
                bytes[i] = data;
                data += 1;
            }
            fos.write(bytes);
        }catch (IOException exception){

        }

    }

}
