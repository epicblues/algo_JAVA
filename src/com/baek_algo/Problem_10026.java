package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_10026 {

  private static final int[] answer = new int[]{0, 0};
  private static boolean[][] visited;
  private static String[][] table;
  private static Integer[] startingPoint;
  private static int n;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    table = new String[n][n];
    visited = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      table[i] = br.readLine().split("");
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        startingPoint = new Integer[]{i, j};
        search(startingPoint);
      }
    }

    visited = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        startingPoint = new Integer[]{i, j};
        search2(startingPoint);
      }
    }

    System.out.println(answer[0] + " " + answer[1]);
  }

  private static void search2(Integer[] point) {
    int x = point[0];
    int y = point[1];
    if (visited[x][y]) {
      return;
    }
    visited[x][y] = true;
    // 탐색한다.
    String color = table[x][y];
    if (color.equals("B")) {
      if (x > 0 && !visited[x - 1][y]) {
        String up = table[x - 1][y];
        if (color.equals(up)) {
          search(new Integer[]{x - 1, y});
        }
      }
      if (x < n - 1 && !visited[x + 1][y]) {
        String down = table[x + 1][y];
        if (color.equals(down)) {
          search(new Integer[]{x + 1, y});
        }
      }
      if (y > 0 && !visited[x][y - 1]) {
        String up = table[x][y - 1];
        if (color.equals(up)) {
          search(new Integer[]{x, y - 1});
        }
      }
      if (y < n - 1 && !visited[x][y + 1]) {
        String up = table[x][y + 1];
        if (color.equals(up)) {
          search(new Integer[]{x, y + 1});
        }
      }

    } else {
      if (x > 0 && !visited[x - 1][y]) {
        String up = table[x - 1][y];
        if ("RG".contains(up)) {
          search2(new Integer[]{x - 1, y});
        }
      }
      if (x < n - 1 && !visited[x + 1][y]) {
        String down = table[x + 1][y];
        if ("RG".contains(down)) {
          search2(new Integer[]{x + 1, y});
        }
      }
      if (y > 0 && !visited[x][y - 1]) {
        String up = table[x][y - 1];
        if ("RG".contains(up)) {
          search2(new Integer[]{x, y - 1});
        }
      }
      if (y < n - 1 && !visited[x][y + 1]) {
        String up = table[x][y + 1];
        if ("RG".contains(up)) {
          search2(new Integer[]{x, y + 1});
        }
      }
    }

    // 모두 방문했으면 돌아가야지
    if (Arrays.equals(point, startingPoint)) {
      answer[1]++;
    }

  }

  private static void search(Integer[] point) {
    int x = point[0];
    int y = point[1];
    if (visited[x][y]) {
      return;
    }
    visited[x][y] = true;
    // 탐색한다.
    String color = table[x][y];
    if (x > 0 && !visited[x - 1][y]) {
      String up = table[x - 1][y];
      if (color.equals(up)) {
        search(new Integer[]{x - 1, y});
      }
    }
    if (x < n - 1 && !visited[x + 1][y]) {
      String down = table[x + 1][y];
      if (color.equals(down)) {
        search(new Integer[]{x + 1, y});
      }
    }
    if (y > 0 && !visited[x][y - 1]) {
      String left = table[x][y - 1];
      if (color.equals(left)) {
        search(new Integer[]{x, y - 1});
      }
    }
    if (y < n - 1 && !visited[x][y + 1]) {
      String right = table[x][y + 1];
      if (color.equals(right)) {
        search(new Integer[]{x, y + 1});
      }
    }
    // 모두 방문했으면 돌아가야지
    if (Arrays.equals(point, startingPoint)) {
      answer[0]++;
    }

  }

}
