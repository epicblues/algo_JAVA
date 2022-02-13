package object.practice10;

import object.practice2.Money;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Duration seconds;
    private Money regularAmount;


    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(taxRate);
        this.regularAmount= regularAmount;
        this.nightlyAmount = nightlyAmount;
    }



    @Override
    protected Money calculateCallFee(Call call) {
        return nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
