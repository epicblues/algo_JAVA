package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1676 {

  private static int result = 0;

  private static void accumulate(int num) {
    while (num >= 5 && num % 5 == 0) {
      num = num / 5;
      result++;
    }

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    var N = Integer.parseInt(br.readLine());
    if (N == 0) {
      System.out.println(0);
      return;
    }

    for (int i = 1; i <= N; i++) {
      accumulate(i);
    }

    System.out.println(result);

  }

}
