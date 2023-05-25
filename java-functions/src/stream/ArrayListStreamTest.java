package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Jack");
        sList.add("Edward");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));

        sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
        System.out.println();
        sList.stream().map(String::length).forEach(n -> System.out.print(n + "\t"));
        sList.stream().filter(s->s.length() >= 5).forEach(System.out::println);
    }
}
