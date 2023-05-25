package inner;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    private class InClass {
        int iNum = 100;

        //        static int sInNum = 500;
        void inTest() {
            System.out.println("inner.OutClass num(외부 클래스의 인스턴스 변수) " + num);
            System.out.println("inner.OutClass sNum(외부 클래스의 스태틱 변수) " + sNum);
            System.out.println("InClass inNum(내부 클래스의 인스턴스 변수) " + iNum);
        }
    }

    public void usingClass() {
        inClass.inTest();
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
        //private class가 아닐때 가능하지만 권장되지 않는 방법
//        InClass inClass = outClass.new InClass();
//        inClass.inTest();
    }
}