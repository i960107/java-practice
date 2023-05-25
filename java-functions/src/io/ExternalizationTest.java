package io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Student implements Externalizable {
    private String name;
    private transient String job;

    public Student() {
    }

    public Student(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
//        out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        //transient로 만들기 위해
//        job = in.readUTF();
    }
}

public class ExternalizationTest {
    public static void main(String[] args) {
        Student lee = new Student("이순신", "대표이사");
        Student kim = new Student("김유신", "상무이사");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("external.txt"))) {
            //클래스 정보, 생성자 정보, 멤버변수 정보 등 다 들어감.
            oos.writeObject(lee);
            oos.writeObject(kim);
        } catch (IOException exception) {
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("external.txt"))) {
            Student pLee = (Student) ois.readObject();
            Student pKim = (Student) ois.readObject();
            System.out.println(pLee.toString());
            System.out.println(pKim.toString());
        } catch (IOException | ClassNotFoundException exception) {
        }


    }
}
