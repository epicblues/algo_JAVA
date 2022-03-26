package effective_java.item1.item2_builder;

public class Burger {

  private final Bread bread;
  private final Patty patty;
  private boolean tomato;
  private boolean salmon;

  // 접근할 수 없다.
  private Burger(Bread bread, Patty patty, boolean tomato, boolean salmon) {
    this.bread = bread;
    this.patty = patty;
    this.tomato = tomato;
    this.salmon = salmon;
  }

  public static Builder builder(Bread bread, Patty patty) {
    return new Builder(bread, patty);
  }

  public enum Patty {
    COW, PIG, DUCK, FISH
  }

  public enum Bread {
    WHEAT,
    WHITE,
    ITALIAN,
  }

  public static class Builder {

    private Burger burger;

    public Builder(Bread bread, Patty patty) {
      this.burger = new Burger(bread, patty, false, false);
    }

    public void setTomato(boolean setTomato) {
      this.burger.tomato = setTomato;

    }

    public void setSalmon(boolean setSalmon) {
      this.burger.salmon = setSalmon;
    }


    public Burger build() {
      return this.burger;
    }
  }


}
