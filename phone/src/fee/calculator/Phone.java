package fee.calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    protected List<Call> calls = new ArrayList<>();
    private double taxRate;

    public Phone(double taxRate) {
        this.taxRate = taxRate;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public Money calculateFee() {
        Money result = Money.ZERO;
        for (Call call : calls) {
            result.plus(calculateCallFee(call));
        }
        result.minus(calculateTaxAmount(result));
        return result;
    }

    protected Money calculateTaxAmount(Money result) {
        return result.times(taxRate);
    }

    ;

    protected abstract Money calculateCallFee(Call call);
}