package com;

import java.util.Map;

public class Parent {
  class Inner{
    void run() {
      var parentThis = Parent.this;
      System.out.println("run");
      System.out.println("run");
      System.out.println("run");
    }
  }


  public static void main(String[] args) {

    var map = Map.of("k1","v1","k2","v2");
    map.entrySet().forEach(entry -> {
      entry.getKey(); // "k1",
      entry.getValue();

    });

    new Parent().new Inner().run();
  }

}
