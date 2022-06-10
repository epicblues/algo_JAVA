package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1922 {

  static int[][] table;
  static StringBuilder answer = new StringBuilder();

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    table = new int[n][n];
    for (int w = 0; w < n; w++) {
      var arr = br.readLine().split("");
      for (int i = 0; i < n; i++) {
        table[w][i] = Integer.parseInt(arr[i]);
      }
    }

    compress(new Point(0, 0), new Point(n - 1, n - 1));

    System.out.println(answer.toString());
  }

  private static void compress(Point p1, Point p2) {
    int checkPoint = table[p1.x][p1.y];
    boolean isSameColor = true;
    loop:
    for (int i = p1.x; i <= p2.x; i++) {
      for (int j = p1.y; j <= p2.y; j++) {
        if (checkPoint != table[i][j]) {
          isSameColor = false;
          break loop;
        }
      }
    }
    if (isSameColor) {
      answer.append(checkPoint);
      return;
    }

    int offset = (p2.x - p1.x) / 2;

    answer.append("(");
    compress(p1, new Point(p1.x + offset, p1.y + offset));
    compress(new Point(p1.x, p1.y + offset + 1), new Point(p1.x + offset, p2.y));
    compress(new Point(p1.x + offset + 1, p1.y), new Point(p2.x, p1.y + offset));
    compress(new Point(p1.x + offset + 1, p1.y + offset + 1), p2);
    answer.append(")");

  }

  static class Point {

    int x;
    int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

  }

}
