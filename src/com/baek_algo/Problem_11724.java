package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_11724 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int m;
    var metaInput = br.readLine().split(" ");
    n = Integer.parseInt(metaInput[0]);
    m = Integer.parseInt(metaInput[1]);

    var graph2 = new int[n + 1][n + 1];
    for (int i = 0; i < m; i++) {
      int a;
      int b;
      var nums = br.readLine().split(" ");
      a = Integer.parseInt(nums[0]);
      b = Integer.parseInt(nums[1]);
      graph2[a][b]++;
      graph2[b][a]++;
    }

    // 무방향 그래프 -> 두 방향 다 등록
    // 이미 연결된 요소 판별 기준 => visited;
    var answer = 0;
    var visited = new boolean[n + 1];
    Queue<Integer> q = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      if (visited[i]) {
        continue;
      }
      answer++;
      q.add(i);
      while (!q.isEmpty()) {
        int next = q.poll();
        visited[next] = true;
        var nodes = graph2[next];
        for (int node = 1; node <= n; node++) {
          if (nodes[node] == 1 && !visited[node]) {
            visited[node] = true;
            q.add(node);
          }
        }
      }
    }

    System.out.println(answer);
  }

}
