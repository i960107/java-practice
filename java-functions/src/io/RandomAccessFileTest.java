package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100);
        System.out.println("pos: " + rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("pos: " + rf.getFilePointer());
        rf.writeUTF("안녕하세요");//17바이트. modified UTF - 8. 한글은 3바이트.
        System.out.println("pos: " + rf.getFilePointer());

        //파일 끝난 곳에서 읽으라고 하기 때문에 EOF 에러가 남.
        //파일 처음으로 돌아가기
        rf.seek(0);
        int i = rf.readInt();
        Double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

    }
}
