package object.practice10;

import object.practice2.Money;

import java.time.Duration;
import java.util.List;

public class RegularPhone extends Phone {
    private Money amount;
    private Duration seconds;

    private double taxRate;

    public RegularPhone(Money amount, Duration seconds, double taxRate) {
        super(taxRate);
        this.amount = amount;
        this.seconds=seconds;
        this.taxRate=taxRate;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money getAmount() {
        return  amount;
    }

    public Duration getSeconds() {
        return seconds;
    }



    // 변경될 가능성이 높은 메서드를 추출
    // 부모 클래스에게 의존하는 유일한 부분
    // 부모 클래스가 변경 되어도 낮은 결합도 유지
    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
