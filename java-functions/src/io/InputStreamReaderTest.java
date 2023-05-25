package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        //InputStreamReader(System.in)에서 사용해봄
        //보조 스트림이 닫히면 기반 스트림도 닫힘.
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
            int i;
            while ((i = isr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException exception) {

        }

    }
}
