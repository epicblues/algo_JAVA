package object.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        // 하나의 할인 정책  -> 다수의 할인 조건
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if(each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }
    
    // 실제 요금 계산 부분
    // Template Method 패턴(부모 클래스에서기본적인 알고리즘을 구현하고 중간에 필요한 처리를 자식 클래스에 위임)
    abstract  protected  Money getDiscountAmount(Screening screening);
}
