package com.practice;

import java.util.function.BinaryOperator;

public enum MyEnumSample {

  // MyEnumSample type 의
  // 유일한 인스턴스를 보장한다.
  ADD("+", Double::sum, 0),
  SUBS("-", (a, b) -> a - b, 4);


  private String operator;
  private BinaryOperator<Double> method;
  private int priority;

  MyEnumSample(String operator,
      BinaryOperator<Double> method, int priority) {
    System.out.println("Enum 상수 생성자 작동");
    this.operator = operator;
    this.method = method;
    this.priority = priority;
  }

}
