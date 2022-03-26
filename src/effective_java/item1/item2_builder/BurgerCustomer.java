package effective_java.item1.item2_builder;

import effective_java.item1.item2_builder.Burger.Bread;
import effective_java.item1.item2_builder.Burger.Patty;

public class BurgerCustomer {
  public static void main(String[] args) {
    Burger.Builder builder = Burger.builder(Bread.WHEAT, Patty.COW);
    builder.setSalmon(true);
    builder.setTomato(true);

    Burger kmsBurger = builder.build();

  }
}
