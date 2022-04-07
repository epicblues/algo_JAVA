package com.practice;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.IntStream;

public class Program {

  public static void main(String[] args)
      throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    TempClass c = new TempClass();
    try {
      c.checkMyMetadata();

    } catch (Exception e) {
      e.printStackTrace();
    }

    IntStream a = IntStream.range(1, 101);
    a.forEach(System.out::println);

  }
}
