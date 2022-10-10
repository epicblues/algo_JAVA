package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Problem_2252 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] meta = br.readLine().split(" ");
    int n = Integer.parseInt(meta[0]);
    int m = Integer.parseInt(meta[1]);

    int[] degrees = new int[n + 1];
    degrees[0] = Integer.MAX_VALUE;
    Map<Integer, Queue<Integer>> graph = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      graph.put(i, new LinkedList<>());
    }

    for (int i = 0; i < m; i++) {
      String[] edge = br.readLine().split(" ");
      int start = Integer.parseInt(edge[0]);
      int end = Integer.parseInt(edge[1]);
      degrees[end]++;
      graph.get(start).offer(end);
    }

    // 시작 degree 찾기
    int start = 0;
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      if (degrees[i] == 0) {
        queue.offer(i);
      }
    }
    var answer = new StringBuilder();
    while (!queue.isEmpty()) {
      start = queue.poll();
      answer.append(start).append(" ");
      for (int next : graph.get(start)) {
        degrees[next]--;
        if (degrees[next] == 0) {
          queue.add(next);
        }

      }
    }

    answer.deleteCharAt(answer.length() - 1);

    System.out.println(answer.toString());
  }

}
