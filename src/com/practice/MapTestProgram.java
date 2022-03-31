package com.practice;

import java.util.HashMap;

public class MapTestProgram {

  public static void main(String[] args) {
    var a = new HashMap<>();

    Long b = 10000L; // 매번 새로운 인스턴스를 생성한다.
    Long c = 10000L;

    //다만 자주 사용하는 숫자 상수 -128~127은 따로 캐싱해두고 있다.

    System.out.println(new Long(5) == new Long(5));

    System.out.println(b == c); //false

    b = 100L;
    c = 100L;

    System.out.println(b == c); // true
  }

}
