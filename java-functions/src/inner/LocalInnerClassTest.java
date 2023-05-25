package inner;

class OutClass3 {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 10;
        class MyRunnable implements Runnable {
            int localNum = 100;

            @Override
            public void run() {
                //runnable class 사용될때는 메소드 로컬 변수 stack에서 해제된 상태
                //로컬 변수들은 final처럼 취급된다.
//                i = 50;
//                num = 20;
                System.out.println("i" + i);
                System.out.println("num" + num);
                System.out.println("localNum" + localNum);

                System.out.println("outNum" + outNum);
                System.out.println("Outer.sNum" + OutClass3.sNum);

            }
        }
        return new MyRunnable();
    }

    Runnable getAnonymousRunnable(){
        return new Runnable(){
            @Override
            public void run() {
                System.out.println("runnable anonymous field");
            }
        };
    }

    Runnable runnable3 = new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable field");
        }
    };
}

public class LocalInnerClassTest {
    public static void main(String[] args) {
        OutClass3 outClass = new OutClass3();
        Runnable runnable = outClass.getRunnable(100);
        runnable.run();
        Runnable runnable2 = outClass.getAnonymousRunnable();
    }
}
