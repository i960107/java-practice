package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        //String 혹은 char[]대상으로 fw가능.
        try (FileWriter fw = new FileWriter("output3.txt")) {
            char buf[] = {'A', 'C', 'D', 'E', 'F'};
            fw.write("안녕하세요");
            fw.write('A');
            fw.write(buf);
        } catch (IOException exception) {

        }
    }
}
