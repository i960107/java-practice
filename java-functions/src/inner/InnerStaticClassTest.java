package inner;
class OutClass2 {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;


    public static class InClass {
        int iNum = 100;
        private static int sInNum = 200;

        void inTest() {
            System.out.println("inner.OutClass sNum(외부 클래스의 스태틱 변수) " + sNum);
            System.out.println("InClass inNum(내부 클래스의 인스턴스 변수) " + iNum);
            System.out.println("InClass inNum(내부 클래스의 스태틱 변수) " + sInNum);
        }

        static void sInTest() {
            System.out.println("inner.OutClass sNum(외부 클래스의 스태틱 변수) " + sNum);
//            System.out.println("InClass inNum(내부 클래스의 인스턴스 변수) " + iNum);
            System.out.println("InClass inNum(내부 클래스의 스태틱 변수) " + sInNum);
        }
    }
}

public class InnerStaticClassTest {
    public static void main(String[] args) {
        OutClass2.InClass sInClass = new OutClass2.InClass();
        sInClass.inTest();
        OutClass2.InClass.sInTest();
    }
}