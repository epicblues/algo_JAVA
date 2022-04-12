package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Problem_10866 {

  public static void main(String[] args) throws IOException {
    var br= new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    StringBuilder answer = new StringBuilder(N);
    var deque = new Deque();

    for (int i = 0; i < N; i++) {
      String[] command = br.readLine().split(" ");
      switch (command[0]) {
        case "push_back":
          deque.pushBack(Integer.parseInt(command[1]));
          break;
        case "push_front":
          deque.pushFront(Integer.parseInt(command[1]));
          break;
        case "front":
          answer.append(deque.front()).append("\n");
          break;
        case "back":
          answer.append(deque.back()).append("\n");
          break;
        case "size":
          answer.append(deque.size()).append("\n");
          break;
        case "empty":
          answer.append(deque.empty()).append("\n");
          break;
        case "pop_front":
          answer.append(deque.popFront()).append("\n");
          break;
        case "pop_back":
          answer.append(deque.popBack()).append("\n");
          break;

      }
    }

    System.out.println(answer);
  }

}


class Deque {
  private final LinkedList<Integer> buffer = new LinkedList<>();

  void pushFront(int target) {
    buffer.add(0, target);
  }

  void pushBack(int target) {
    buffer.add(target);
  }

  int popFront() {
    if(buffer.isEmpty()) return -1;
    return buffer.remove();
  }

  int popBack() {
    if(buffer.isEmpty()) return -1;
    return buffer.remove(buffer.size() -1);
  }

  int size() {
    return buffer.size();
  }

  int empty() {
    return buffer.isEmpty() ? 1 : 0;
  }

  int front() {

    if(buffer.isEmpty()) return -1;
    return buffer.getFirst();
  }

  int back() {

    if(buffer.isEmpty()) return -1;
    return buffer.getLast();
  }


}
