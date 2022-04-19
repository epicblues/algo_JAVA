package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_11651 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    var answer = new StringBuilder();
    Point[] arr = new Point[N];

    for (int i = 0; i < N; i++) {
      arr[i] = new Point(br.readLine());
    }

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      answer.append(arr[i]).append("\n");
    }

    System.out.println(answer);
  }



}

class Point implements Comparable<Point> {

  int x;
  int y;

  public Point(String candidate) {
    String[] buffer = candidate.split(" ");
    x = Integer.parseInt(buffer[0]);
    y = Integer.parseInt(buffer[1]);

  }

  @Override
  public int compareTo(Point target) {
    int yCompareResult = Integer.compare(this.y, target.y);
    if(yCompareResult == 0) {
      return Integer.compare(this.x, target.x);
    }

    return yCompareResult;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == this) return true;
    if(obj instanceof Point) {
      return compareTo((Point) obj) == 0;
    }

    return false;
  }

  @Override
  public String toString() {
    return String.format("%d %d", this.x, this.y);
  }
}
