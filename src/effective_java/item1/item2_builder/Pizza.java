package effective_java.item1.item2_builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

  final Set<Topping> toppings;

  Pizza(Builder<?> builder) {
    toppings = builder.toppings.clone();
  }

  public enum Topping {HAN, MUSHROOM, ONION, PEPPER, SAUSAGE}

  // 재귀적 타입 한정

  abstract static class Builder<T extends Builder<T>> {

    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

    public T addTopping(Topping topping) {
      toppings.add(Objects.requireNonNull(topping));
      return self();
    }

    abstract Pizza build();

    // 하위 메서드에서는 형변환을 할 필요가 없다.
    protected abstract T self();
  }

}
