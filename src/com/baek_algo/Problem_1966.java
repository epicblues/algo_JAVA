package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_1966 {

  private int num = 0;
  private Set<Integer> set = new HashSet<Integer>() {{
    add(3);
    add(Problem_1966.this.num);
  }};

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    // 내가 가장 우선순위에 있는지를 체크한다.
    var answer = new StringBuilder(N);
    for (int i = 0; i < N; i++) {
      int count = 0;
      var arr = br.readLine().split(" ");
      int size = Integer.parseInt(arr[0]);
      int index = Integer.parseInt(arr[1]);
      Queue<DataRecord> queue = new LinkedList<>();
      var map = IntStream.range(1, 10).boxed().collect(Collectors.toMap(n -> n, n -> 0));
      var queueArr = br.readLine().split(" ");
      for (int j = 0; j < size; j++) {
        var s = queueArr[j];

        var value = Integer.parseInt(s);
        var target = new DataRecord(j, value);
        map.put(value, map.get(value) + 1);
        queue.offer(target);
      }
      int maxValue = getMaxValue(map, 9);
      while (!queue.isEmpty()) {
        var target = queue.poll();
        maxValue = getMaxValue(map, maxValue);
        if (target.value == maxValue) {
          count++;
          map.put(maxValue, map.get(maxValue) - 1);
          if (target.index == index) {
            answer.append(count).append("\n");
            break;
          }
          continue;
        }
        queue.offer(target);
      }


    }
    System.out.println(answer);
  }

  private static int getMaxValue(Map<Integer, Integer> map, int before) {
    for (int i = before; i > 0; i--) {
      if (map.get(i) > 0) {
        return i;
      }
    }

    return 1;
  }


}

class DataRecord {

  int index;
  int value;

  public DataRecord(int index, int value) {
    this.index = index;
    this.value = value;
  }
}
