package com.practice;

public class BooleanCheckProgram {

  public static void main(String[] args) {
    // 새로운 객체를 생성하지 않는다. 같은 Boolean.TRUE 객체를 반환한다.
    Boolean bool1 = Boolean.valueOf("true");
    Boolean bool2 = Boolean.valueOf("true");
    Boolean bool3 = Boolean.TRUE;

    System.out.println(
        "bool1과 bool2의 hashCode가 같을 까? :" + (bool1 == bool2 && bool2 == bool3)); // 같다.
  }


}
