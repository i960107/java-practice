package thread;

class Bank {
    private int money = 10000;

    public synchronized void saveMoney(int amount) {
        System.out.println("save money start");
        int m = getMoney();
        System.out.println("save got money" + m);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m + amount);
        System.out.println("saved money");
    }

    // 같은 의미.
//    public void saveMoney(int amount) {
//        synchronized (this) {
//            int m = getMoney();
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException exception) {
//                exception.printStackTrace();
//            }
//            setMoney(m + amount);
//        }
//    }

    //saveMoney minusMoney 둘중 하나만 synchrnoized걸어주면 안되는 이유. minusMoney함수가 더 먼저 실행될 수 있음
    public void minusMoney(int amount) {
        System.out.println("minus money start");
        int m = getMoney();
        System.out.println("minus got money" + m);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - amount);
        System.out.println("minused money");
    }

    public int getMoney() {
        return money;
    }

    private void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread {
    @Override
    public void run() {
        System.out.println("start save");
        SyncMethodTest.myBank.saveMoney(3000);
        System.out.println("park save money: " + SyncMethodTest.myBank.getMoney());
    }
}

class ParkWife extends Thread {
    @Override
    public void run() {
        System.out.println("start minus");
        SyncMethodTest.myBank.minusMoney(1000);
        System.out.println("wife spent money : " + SyncMethodTest.myBank.getMoney());
    }
}

public class SyncMethodTest {

    //여러 스레드가 공유하는 자원
    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        Park park = new Park();
        park.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //park의 save함수가 끝나기전에 wife의 minus함수가 시작됨
        ParkWife wife = new ParkWife();
        wife.start();
    }

}
