package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_9095 {

  private static int[] table = new int[12];

  public static void main(String[] args) throws IOException {

    // Dynamic Programming

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    int[] target = new int[t];
    int max = 0;
    for (int i = 0; i < t; i++) {
      int input = Integer.parseInt(br.readLine());
      max = Math.max(input, max);
      target[i] = input;
    }

    table[1] = 1;
    table[2] = 2;
    table[3] = 4;

    populateTable(max);

    var answer = new StringBuilder();
    for (int input : target) {
      answer.append(table[input]).append("\n");
    }
    answer.delete(answer.length() - 1, answer.length());
    System.out.println(answer.toString());
  }

  private static int populateTable(int num) {
    if (num <= 3) {
      // base case
      return table[num];
    }

    int memo = populateTable(num - 1) + populateTable(num - 2) + populateTable(num - 3);
    table[num] = memo;
    return memo;
  }

}
