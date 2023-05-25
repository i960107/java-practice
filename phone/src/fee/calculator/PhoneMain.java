package fee.calculator;

import java.time.Duration;
import java.time.LocalDateTime;

public class PhoneMain {
    public static void main(String[] args) {
        RegularPhone phone = new RegularPhone(Money.wons(5), Duration.ofSeconds(10), 0.22);
        phone.call(new Call(
                LocalDateTime.of(2018, 1, 1, 12, 10, 0),
                LocalDateTime.of(2018, 1, 1, 12, 11, 0)));

        phone.call(new Call(
                LocalDateTime.of(2018, 1, 2, 12, 10, 0),
                LocalDateTime.of(2018, 1, 2, 12, 11, 0)));

        System.out.println(phone.calculateFee());
    }
}
