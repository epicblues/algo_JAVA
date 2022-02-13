package object.practice10;

import object.practice2.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
