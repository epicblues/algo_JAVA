package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Problem_2630 {

  static int[] answer = new int[]{0, 0};
  static int[][] table;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    // 입력값 n*n 배열에 채우기
    table = new int[n][n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < n; j++) {
        table[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    var first = new Point(0, 0);
    var fourth = new Point(n - 1, n - 1);

    count(first, fourth);

    System.out.println(answer[0] + "\n" + answer[1]);

  }

  private static void count(Point first, Point fourth) {
    var firstColor = table[first.y][first.x];
    if (first.equals(fourth)) {
      answer[firstColor]++;
      return;

    }
    var isSameColor = true;
    entry:
    for (int i = first.y; i <= fourth.y; i++) {
      for (int j = first.x; j <= fourth.x; j++) {
        if (firstColor != table[i][j]) {
          isSameColor = false;
          break entry;
        }
      }
    }
    if (!isSameColor) {
      int length = fourth.x - first.x + 1;
      int offset = length / 2;
      count(first, new Point(first.x + offset - 1, first.y + offset - 1));
      count(new Point(first.x + offset, first.y), new Point(fourth.x, first.y + offset - 1));
      count(new Point(first.x, first.y + offset), new Point(first.x + offset - 1, fourth.y));
      count(new Point(first.x + offset, first.y + offset), fourth);
      return;
    }
    answer[firstColor]++;
  }

  static class Point {

    final int x;
    final int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Point)) {
        return false;
      }
      Point point = (Point) o;
      return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
      return Objects.hash(x, y);
    }
  }

}
