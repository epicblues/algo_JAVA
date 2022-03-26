package effective_java.item1.item2_builder;

public class NormalClass {

  private final int importantField1;
  private final String importantField2;
  private int optionalField1;
  private String optionalField2;
  private int[] optionalField3;

  public NormalClass(int importantField1, String importantField2) {
    this(importantField1, importantField2, 0, "default", new int[]{1, 2, 3, 4, 5});
  }

  public NormalClass(int importantField1, String importantField2, int optionalField1) {
    this(importantField1, importantField2, optionalField1, "default", new int[]{1, 2, 3, 4, 5});
  }

  public NormalClass(int importantField1, String importantField2, int optionalField1,
      String optionalField2) {
    this(importantField1, importantField2, optionalField1, optionalField2,
        new int[]{1, 2, 3, 4, 5});
  }


  public NormalClass(int importantField1, String importantField2, int optionalField1,
      String optionalField2, int[] optionalField3) {
    this.importantField1 = importantField1;
    this.importantField2 = importantField2;
    this.optionalField1 = optionalField1;
    this.optionalField2 = optionalField2;
    this.optionalField3 = optionalField3;
  }


}
