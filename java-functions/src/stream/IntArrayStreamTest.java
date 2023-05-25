package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }
        //배열의 스트림 생성
        //stream은 람다식을 사용함 -> 익명 내부 클래스가 생성됨
        Arrays.stream(arr).forEach(n -> System.out.println(n));
        Arrays.stream(arr).forEach(System.out::println);

        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(System.out::println);
        //intStream 재사용 불가
    }
}
