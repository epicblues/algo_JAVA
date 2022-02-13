package object.practice10;

import object.practice2.Money;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Phone {
    // 합성
    // 런타임 의존성
    // 어떤 ratePolicy 클래스랑 협력할지는 아무도 모른다.
    private RatePolicy ratePolicy;
    protected List<Call> calls= new ArrayList<>();

    // 의존성 주입
    public  Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }


    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }
}
