package fee.calculator;

import java.time.Duration;

public class RegularPhone extends Phone {
    private Money amount;
    //10초당 5원씩
    private Duration seconds;

    //상속을 위해서는 default constructor 필요
//    protected Phone() {
//    }

    public RegularPhone(Money amount, Duration seconds, double taxRate) {
        super(taxRate);;;;
        this.amount = amount;
        this.seconds = seconds;
    }


    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }


}
