package effective_java.item1.item2_builder;

public class ArrayCopyTest {

  public static void main(String[] args) {
    byte[] original = new byte[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
    byte[] target = new byte[]{6, 7, 8, 9, 10};

    String beforeCopyHashCode = original.toString();
    System.arraycopy(target, 0, original, 5, target.length);
    String afterCopyHashCode = original.toString();
    for (byte c : original
    ) {
      System.out.println(c);
    }


  }
}

