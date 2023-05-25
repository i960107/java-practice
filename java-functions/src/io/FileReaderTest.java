package io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("reader.txt")) {
            int i;
            //FileInputStream으로 한글을 읽을 경우 정확하지 않음. 깨짐.
            //java char => 2바이트. 영어의 경우 byte와 호환됨. asciicode. 한글의 경우 호환되지 않음.
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException exception) {

        }
    }
}
