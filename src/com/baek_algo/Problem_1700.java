package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Problem_1700 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    var metadata = br.readLine().split(" ");
    int holeCapacity = Integer.parseInt(metadata[0]);
    var usages = br.readLine().split(" ");
    var usageTable = new HashMap<String, Consent>();

    for (int i = 0; i < usages.length; i++) {
      usageTable.putIfAbsent(usages[i], new Consent(usages[i]));
      usageTable.get(usages[i]).requirement++;
    }

    var tab = new PriorityQueue<Consent>();
    // requirement가 가장 적고 순서상 뒤에 있는 전기 용품 찾기
    int answer = 0;
    for (String usage : usages) {
      var next = usageTable.get(usage);
      next.requirement--;
      if (tab.contains(next)) {
        continue;
      }

      if (tab.size() == holeCapacity) {
        // 제거할 전기용품을 찾는다.
        tab.poll();
        answer++;
      }
      tab.offer(next);
    }

    System.out.print(answer);
  }

  static class Consent implements Comparable<Consent> {

    String type;
    int requirement = 0;

    Consent(String type) {
      this.type = type;
    }

    @Override
    public int compareTo(Consent o) {
      return requirement - o.requirement;
    }
  }
}
