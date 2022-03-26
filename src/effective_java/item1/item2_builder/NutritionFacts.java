package effective_java.item1.item2_builder;

public class NutritionFacts {

  private final int servingSize;

  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  // 직접 객체 생성 불가능
  private NutritionFacts(Builder builder) {
    servingSize = builder.servingSize;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrate = builder.carbohydrate;
    servings = builder.servings;
  }

  public static class Builder {

    private final int servingSize;
    private final int servings;
    private int fat;
    private int sodium;
    private int carbohydrate;
    private int calories;


    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int val) {
      this.calories = val;
      return this;
    }

    public Builder fat(int val) {
      this.fat = val;
      return this;
    }

    public Builder carbohydrate(int val) {
      this.carbohydrate = val;
      return this;
    }

    public Builder sodium(int val) {
      this.sodium = val;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }

  }
}
