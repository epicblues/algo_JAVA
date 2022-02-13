package object.practice9;

import object.practice2.AmountDiscountPolicy;
import object.practice2.DiscountCondition;
import object.practice2.Money;
import object.practice2.Movie;

import java.time.Duration;

public class Client {
    private Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }


    public Money getAvatarFee() {
        // 생성 책임을 팩토리에게 전달
        // 생성과 관련된 지식이 필요 없다.
        Movie avatar = factory.createAvatarMovie();
        // 생성된 객체를 사용
        return avatar.getFee();
    }
}
