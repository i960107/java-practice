package fee.calculator;

import java.math.BigDecimal;

public class Money {
    public static Money ZERO = new Money(BigDecimal.ZERO);
    private BigDecimal amount;

    //
    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    private Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money times(long time) {
        return new Money(amount.multiply(BigDecimal.valueOf(time)));
    }
    public Money times(double time) {
        return new Money(amount.multiply(BigDecimal.valueOf(time)));
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                '}';
    }

    public Money plus(Money other) {
        return new Money(amount.add(other.amount));
    }

    public Money minus(Money other) {
        return new Money(amount.subtract(other.amount));
    }
}
