package object.practice10;

import object.practice2.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    protected List<Call> calls= new ArrayList<>();
    private double taxRate;

    public Phone(double taxRate) {
        this.taxRate = taxRate;
    }

    public Money calculateFee() {
        Money result =Money.ZERO;
        for(Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }
        return result.plus(result.times(taxRate));
    }

    // 유일하게 수정이 열려 있는 부분
    // 새로운 요금제가 필요하면 이 부분만 구현하면 된다.
    // 상속된 클래스들이 이 추상화에 의존한다.
    abstract protected Money calculateCallFee(Call call);

}
