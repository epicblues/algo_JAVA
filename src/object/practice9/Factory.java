package object.practice9;

import java.time.Duration;
import object.practice2.AmountDiscountPolicy;
import object.practice2.Money;
import object.practice2.Movie;
import object.practice2.PeriodCondition;

public class Factory {

  public Movie createAvatarMovie() {
    // 의존성 주입 - 생성자 주입
    return new Movie("아바타",
        Duration.ofMinutes(120),
        Money.wons(10000),
        new AmountDiscountPolicy(new PeriodCondition()));
  }
}
