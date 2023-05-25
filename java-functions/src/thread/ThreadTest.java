package thread;

// thread가 실행되면 run()이 실행됨.
class MyThread extends Thread {

    @Override
    public void run() {
        int i;
        for (i = 1; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        int i;
        for (i = 1; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //스레드를 상속한 클래스로 스레드 만들기
        //Thread[main,5,main] 스레드를 호출한 함수, 우선순위, 스레드그룹
        //main thread는 thread2개 실행하고 가장 먼저 끝남.
        //총 3개 스레드가 실행됨.
        System.out.println(Thread.currentThread() + "start");
        Thread thread1 = new MyThread();
        thread1.start();
        Thread thread2 = new MyThread();
        thread2.start();

        //runnable을 구현한 클래스를 활용해 스레드 만들기
        MyRunnable runnable = new MyRunnable();
        Thread thread3 = new Thread(runnable);
        thread3.start();
        Thread thread4 = new Thread(runnable);
        thread4.start();

        //익명 runnable 클래스를 사용해 스레드 만들기
        //추상 클래스나 인터페이스의 구현해야하는 메소드가 하나인 경우 익명 클래스 대신 람다 사용 가능(컴파일러가 익명 클래스 생성)
        Thread thread5 = new Thread(() -> System.out.println("thread run"));
        thread5.start();

        System.out.println(Thread.currentThread() + "end");


    }
}
