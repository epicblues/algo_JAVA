package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11399 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    var table = new int[1001];

    // 값들을 테이블에 넣는다.
    var nums = br.readLine().split(" ");
    for (String token : nums) {
      int num = Integer.parseInt(token);
      table[num]++;
    }

    // 합을 구한다. 총계와 누적합을 따로 분류해서 구한다.
    int increment = 0;
    int total = 0;

    for (int n = 1; n <= 1000; n++) {
      int count = table[n];
      while (count > 0) {
        increment += n;
        total += increment;
        count--;
      }
    }

    System.out.println(total);
  }

}
