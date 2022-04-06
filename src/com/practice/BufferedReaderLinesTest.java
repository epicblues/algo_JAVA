package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class BufferedReaderLinesTest {

  public static void main(String[] args) {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    AtomicInteger count = new AtomicInteger();
    bufferedReader.lines().limit(5).forEach(System.out::println);
  }

}
