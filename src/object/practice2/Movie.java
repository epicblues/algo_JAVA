package object.practice2;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;
    // 컴파일 의존성(클래스 사이의 의존성)
    // 이 시점에서 영화는 어떤 할인 정책과 할인 조건을 사용할 것인지 판단하지 않는다.
    // 합성

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        // 하나의 영화에 대한 하나의 할인 정책
        // 런타임에 생성자 코드가 호출되면서 어떤 종류의 영화가 어떤 할인 정책과 조건들에 의존할지 결정된다
        // 런타임 의존성(객체 사이의 의존성)

        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy =discountPolicy;
    }

    public Money getFee() {
        return  fee;
    }

    public Money calculateMovieFee(Screening screening) {
        
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
