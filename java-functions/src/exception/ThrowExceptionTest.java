package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExceptionTest {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowExceptionTest throwsTest = new ThrowExceptionTest();
        try {
            throwsTest.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("end");

    }
}

