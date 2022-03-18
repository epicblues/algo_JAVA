package com.practice;

import java.lang.reflect.InvocationTargetException;

public class Program {

  public static void main(String[] args)
      throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    TempClass c = new TempClass();
    try {
      c.checkMyMetadata();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
