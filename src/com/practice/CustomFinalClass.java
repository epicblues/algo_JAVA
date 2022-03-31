package com.practice;

import java.util.function.Supplier;

public final class CustomFinalClass {

  private final Supplier<? extends Number> numberFactory;


  public CustomFinalClass(Supplier<? extends Number> numberFactory) {
    this.numberFactory = numberFactory;
  }


  public Number returnRandomNumber() {
    return numberFactory.get();
  }
}
