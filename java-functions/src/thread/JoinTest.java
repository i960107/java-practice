package thread;

public class JoinTest extends Thread {
    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            total += i;
        }
    }

    public static void main(String[] args) {
        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);
        jt1.start();
        jt2.start();
        try {
            //main이 jt1의 join()을 호출 -> main이 not runnable 상태가 됨.
            jt1.join();
            jt2.join();
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
        //아직 thread안 끝난 경우 중간값이 출력됨
        int final_total = jt1.total + jt2.total;
        System.out.println("jt1 total : " + jt1.total);
        System.out.println("jt2 total : " + jt2.total);
        System.out.println("final total : " + final_total);
    }
}
