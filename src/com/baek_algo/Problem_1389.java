package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Problem_1389 {

  private static int N;
  private static int M;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    var inputs = br.readLine().split(" ");
    N = Integer.parseInt(inputs[0]); // Vertex 개수
    M = Integer.parseInt(inputs[1]); // Edges 개수

    // 특정 노드로 향하는 방법은 여러개일 수 있다.
    // 이 중 가장 비용이 적은 방법(거쳐 가는 간선의 개수가 최소)을 선별한 후에,
    //
    // 테이블에 등록한 후, 비용들의 합을 구한 뒤 정렬한다.

    // 그래프 만들기

    LinkedList<Integer>[] graph = new LinkedList[N + 1];
    for (int i = 0; i < N + 1; i++) {
      graph[i] = new LinkedList<>();
    }

    for (int i = 0; i < M; i++) {
      var nums = br.readLine().split(" ");
      // 그래프의 리스트가 중복될 수 있다.
      int a = Integer.parseInt(nums[0]);
      int b = Integer.parseInt(nums[1]);
      if (graph[a].contains(b) || graph[b].contains(a)) {
        continue;
      }
      graph[a].add(b);
      graph[b].add(a);
    }

    // 최소 비용 모음 구하기.
    var table = new int[N + 1][N + 1];

    // BFS로 순회하면 방문하는 순간 그 해당 노드의 비용이 갱신된다.
    // 방문 테이블을 만들고, 그 테이블의 모든 node가 visited될 때까지 방문한다.

    for (int i = 1; i < N + 1; i++) {
      var tableRow = table[i];
      LinkedList<Integer[]> queue = new LinkedList<>();
      queue.add(new Integer[]{1, i});
      while (!queue.isEmpty()) {
        Integer[] nextData = queue.poll();
        int count = nextData[0];
        int target = nextData[1];
        var graphRow = graph[target];
        for (int node : graphRow) {

          if (node == i || tableRow[node] > 0) {
            // 이미 최소 비용이 찍혀 있다. == 방문했다.
            continue;
          }
          tableRow[node] = count;
          queue.add(new Integer[]{count + 1, node});
        }

      }
    }

    // 각 테이블의 idnex가 친구 이름;
    // 이걸 재정렬해야 한다.

    PriorityQueue<Integer[]> heap = new PriorityQueue<>((a, b) -> {

      int valueCompared = Integer.compare(a[1], b[1]);
      if (valueCompared == 0) {
        return Integer.compare(a[0], b[0]);
      }
      return valueCompared;
    }
    );
    for (int i = 1; i < table.length; i++) {
      int[] row = table[i];

      int sum = 0;
      for (int k : row) {
        sum += k;
      }
      heap.add(new Integer[]{i, sum});
    }

    System.out.println(heap.poll()[0]);

  }

}
