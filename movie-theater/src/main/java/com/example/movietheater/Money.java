package com.example.movietheater;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal amount;

    // TODO: 2023/05/18 Money 클래스를 따로 두는 이유...? 그냥 BigDecimal사용하면 안되나.
    // int든 long타입이든 big decimal로 통합시켜 관리. big demical은 연산 메소드가 필요 -> 인터페이스 제공
    // 값이 금액과 관련있따는 의미를 전달할 수 없다.
    // 금액과 관련된 로직이 서로 다른 곳에 중복되어 구현되는 것을 막을 수 없다.
    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public static final Money ZERO = Money.wons(0);

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    // TODO: 2023/05/18 너무 specific한 parameter name아닌가. 할인율 계산말고도 배수 계산할 경우 많을텐데
    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }
}
