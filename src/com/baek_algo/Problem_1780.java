package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem_1780 {

  static int[][] table = null;
  private static Map<Integer, Integer> answer;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    table = new int[n][n];
    for (int i = 0; i < n; i++) {
      var line = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        table[i][j] = Integer.parseInt(line[j]);
      }
    }

    answer = new HashMap<>();
    answer.put(0, 0);
    answer.put(-1, 0);
    answer.put(1, 0);

    recursion(new int[]{0, 0}, n);

    for (int i = -1; i < 2; i++) {
      System.out.println(answer.get(i));
    }
  }

  private static void recursion(int[] startPoint, int length) {
    int x1 = startPoint[0];
    int y1 = startPoint[1];
    int x2 = x1 + length - 1;
    int y2 = y1 + length - 1;
    int targetNum = table[x1][y1];
    boolean isPaper = true;
    loop:
    for (int i = x1; i <= x2; i++) {

      for (int j = y1; j <= y2; j++) {
        int nextNum = table[i][j];
        if (targetNum != nextNum) {
          isPaper = false;
          break loop;
        }
      }
    }
    int newLength = length / 3;
    if (!isPaper) {
      recursion(new int[]{x1, y1}, newLength);
      recursion(new int[]{x1, y1 + newLength}, newLength);
      recursion(new int[]{x1, y1 + newLength * 2}, newLength);
      recursion(new int[]{x1 + newLength, y1}, newLength);
      recursion(new int[]{x1 + newLength, y1 + newLength}, newLength);
      recursion(new int[]{x1 + newLength, y1 + newLength * 2}, newLength);
      recursion(new int[]{x1 + newLength * 2, y1}, newLength);
      recursion(new int[]{x1 + newLength * 2, y1 + newLength}, newLength);
      recursion(new int[]{x1 + newLength * 2, y1 + newLength * 2}, newLength);
    } else {
      answer.put(targetNum, answer.get(targetNum) + 1);
    }

  }

}
