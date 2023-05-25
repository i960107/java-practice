package stream;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Tomas");
        students.add("Jack");
        students.add("Edward");

        String longestName = students.stream().reduce(new CompareString()).get();
        System.out.println(longestName);

        System.out.println("안" + "안".getBytes(StandardCharsets.UTF_8).length); //3
        System.out.println("^" + "^".getBytes(StandardCharsets.UTF_8).length); //1
        System.out.println("h" + "e".getBytes(StandardCharsets.UTF_8).length); //1
        System.out.println("안" + "안".getBytes(StandardCharsets.UTF_16).length); //4
        System.out.println("^" + "^".getBytes(StandardCharsets.UTF_16).length); //4
        System.out.println("h" + "e".getBytes(StandardCharsets.UTF_16).length); //4

        String[] greetings = {"안녕하세요", "hello", "Good morning", "반갑습니다^^"};
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> s1.length() >= s2.length() ? s1 : s2));
        //한글은 2바이트 영어는 1바이트. 위와 결과 다름. getBytes() default UTF-8사용
        System.out.println(Arrays.stream(greetings)
                .reduce("", (s1, s2) -> s1.getBytes().length >= s2.getBytes().length ? s1 : s2));


    }
}
