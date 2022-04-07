package com.practice.abstract_interface;

import java.util.AbstractList;

public class Test {

  public static void main(String[] args) {
    var arr = new int[]{1, 2, 3, 4, 5};

    var unmodifiableList = new AbstractList<>() {

      @Override
      public int size() {
        return arr.length;
      }

      @Override
      public Object get(int index) {
        return arr[index];
      }
    };

    System.out.println(unmodifiableList.add(99));

    var entry = new AbstractMapEntry<>() {

      @Override
      public Object getKey() {
        return null;
      }

      @Override
      public Object getValue() {
        return null;
      }

    };
  }

}
