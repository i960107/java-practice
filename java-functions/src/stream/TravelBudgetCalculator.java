package stream;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private int age;
    private int budget;

    public Customer(String name, int age, int budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class TravelBudgetCalculator {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer lee = new Customer("이순신", 40, 100);
        Customer kim = new Customer("김유신", 20, 50);
        Customer hong = new Customer("홍길동", 13, 50);
        customerList.add(lee);
        customerList.add(kim);
        customerList.add(hong);

        System.out.println("-----------------고객 명단 출력 ------------");
        customerList.stream().map(customer -> customer.getName()).forEach(System.out::println);

        System.out.println("-----------------여행 비용 ------------");
        // 20세 이상인 고객을 이름순으로 정렬하여 출력
        // mapToInt()사용 가능. 반환값이 int임을 보장하면-> sum()함수 사용가능
        int budget1 = customerList.stream()
                .mapToInt(customer -> customer.getAge() >= 15 ? 100 : 50)
                .sum();
        int budget2 = customerList.stream()
                .map(customer -> customer.getAge() >= 15 ? 100 : 50)
                .reduce(0, (x, y) -> x + y);
        System.out.println(budget1 + " " + budget2);

        System.out.println("------------20세 이상 고객 정렬---------------");
        customerList.stream()
                .filter(c -> c.getAge() >= 20)
                .map(c -> c.getName())
                .sorted()
                .forEach(System.out::println);
    }
}
