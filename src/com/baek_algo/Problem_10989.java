package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_10989 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    var answer = new StringBuilder(N);

    int[] table = new int[10001];

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());

      table[num]++;

    }

    for (int i = 0; i < table.length; i++) {
      int count = table[i];
      for (int j = 0; j < count; j++) {
        answer.append(i).append("\n");
      }
    }

    System.out.println(answer);
  }
}
