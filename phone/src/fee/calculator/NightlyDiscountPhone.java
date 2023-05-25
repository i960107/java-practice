package fee.calculator;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;


    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(taxRate);
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }


    @Override
    protected Money calculateCallFee(Call call) {
        if (call.isAfter(LATE_NIGHT_HOUR)) {
            return calculateLateNightCallFee(call.getDuration());
        } else {
            return calculateRegularCallFee(call.getDuration());
        }
    }

    private Money calculateLateNightCallFee(Duration duration) {
        return nightlyAmount.times(duration.getSeconds() / seconds.getSeconds());
    }

    private Money calculateRegularCallFee(Duration duration) {
        return regularAmount.times(duration.getSeconds() / seconds.getSeconds());
    }
}