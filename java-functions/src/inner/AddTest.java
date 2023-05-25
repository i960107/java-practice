package inner;

//functional interface: 추상 메서드가 오직 하나. -> 람다식을 선언하기 위한 인터페이스.
@FunctionalInterface
interface Add {
    //함수 하나뿐
    int add(int x, int y);
}

public class AddTest {
    public static void main(String[] args) {
        Add add = (x, y) -> x + y;
        System.out.println(add.add(2, 3));

    }
}

