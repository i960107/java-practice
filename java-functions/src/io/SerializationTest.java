package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private transient String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person lee = new Person("이순신", "대표이사");
        Person kim = new Person("김유신", "상무이사");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.txt"))) {
            //클래스 정보, 생성자 정보, 멤버변수 정보 등 다 들어감.
            oos.writeObject(lee);
            oos.writeObject(kim);
        } catch (IOException exception) {
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"))) {
            Person pLee = (Person) ois.readObject();
            Person pKim = (Person) ois.readObject();
            System.out.println(pLee.toString());
            System.out.println(pKim.toString());
        } catch (IOException | ClassNotFoundException exception) {
        }
    }
}
