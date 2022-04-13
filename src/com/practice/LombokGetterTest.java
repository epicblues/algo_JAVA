package com.practice;


import java.util.Arrays;
import lombok.Getter;

public class LombokGetterTest {

  public static void main(String[] args) {
    var instance = new ClassWithVariantComponent();
    var ints = instance.getInts();
    System.out.println(Arrays.toString(ints));

    ints[2] = 1111;

    System.out.println(Arrays.toString(instance.getInts()));

  }
}

@Getter
class ClassWithVariantComponent {

  private final int[] ints
      = {1,2,3,4,5};
}
