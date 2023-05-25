package thread;

class WooriBank {
    private int money = 10000;

    public void saveMoney(int amount) {
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

class Kim extends Thread {
    @Override
    //쓰는 쪽에서 lock 걸기

    public void run() {
        synchronized (SyncBlockTest.myBank) {
            System.out.println("start save");
            SyncBlockTest.myBank.saveMoney(3000);
            System.out.println("park save money: " + SyncBlockTest.myBank.getMoney());
        }
    }
}

class KimWife extends Thread {
    @Override
    public void run() {
        synchronized (SyncBlockTest.myBank) {
            System.out.println("start minus");
            SyncBlockTest.myBank.minusMoney(1000);
            System.out.println("wife spent money : " + SyncBlockTest.myBank.getMoney());
        }
    }
}

public class SyncBlockTest {

    //여러 스레드가 공유하는 자원
    public static WooriBank myBank = new WooriBank();

    public static void main(String[] args) {
        Kim kim = new Kim();
        kim.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //park의 save함수가 끝나기전에 wife의 minus함수가 시작됨
        KimWife wife = new KimWife();
        wife.start();
    }

}
