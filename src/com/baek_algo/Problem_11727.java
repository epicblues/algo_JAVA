package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11727 {

  public static void main(String[] args) throws IOException {
    // 10007로 나눈다 -> 표현범위를 반드시 초과한다.
    // f(n) = f(n - 1) + f(n - 2) * 3;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    if (n == 1) {
      System.out.println(1);
      return;
    } else if (n == 2) {
      System.out.println(3);
      return;
    }

    int[] table = new int[n + 1];

    table[1] = 1;
    table[2] = 3;

    for (int i = 3; i <= n; i++) {
      table[i] = (table[i - 1] + 2 * table[i - 2]) % 10007;
    }

    System.out.println(table[n]);
  }

}
