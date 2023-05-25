package thread;

import java.util.ArrayList;

class FastLibrary {
    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary() {
        shelf.add("태백산맥1");
        shelf.add("태백산맥2");
        shelf.add("태백산맥3");
//        shelf.add("태백산맥4");
//        shelf.add("태백산맥5");
    }

    public synchronized String lend() throws InterruptedException {
        Thread t = Thread.currentThread();
        while (shelf.isEmpty()) {
            System.out.println(t.getName() + "wait");
            wait();
            System.out.println(t.getName() + "wait end");
        }
        String book = shelf.remove(0);
        System.out.println(t.getName() + ": " + book + "lend");
        return book;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ": " + book + "return");
    }
}

class Student extends Thread {
    public Student(String name) {
        super(name);
    }


    @Override
    public void run() {
        try {
            String title = LibraryMain.library.lend();
            if (title == null) {
                System.out.println(getName() + "couldn't lend");
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {
    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {
        //학생이 순차적으로 책을 빌리지만, 로그 찍히는 순서는 다름
        //학생의 수보다 책 수가 작으면 IndexOutOfBoundException 발생
        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");
        Student std6 = new Student("std6");
        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
        System.out.println("end");
    }
}
