package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11050 {

  public static void main(String[] args) throws IOException {
    var br =new BufferedReader(new InputStreamReader(System.in));

    var table = br.readLine().split(" ");
    int N = Integer.parseInt(table[0]);
    int K = Integer.parseInt(table[1]);

    int top = 1;
    int bottom = 1;

    for (int i = N; i > N - K; i--) {
      top *= i;
    }

    for (int i = 1 ; i <= K; i++) {
      bottom *= i;
    }

    System.out.println(top / bottom);

  }
}
