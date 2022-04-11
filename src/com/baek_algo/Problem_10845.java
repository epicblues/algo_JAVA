package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Problem_10845 {

  public static void main(String[] args) throws IOException {
    var br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    var answer = new StringBuilder();

    Queue queue = new Queue();
    for(int i = 0; i < N; i++) {
      String[] command = br.readLine().split(" ");
      if(command.length == 2) {
        queue.push(Integer.parseInt(command[1]));
        continue;
      }
      switch(command[0]) {
        case "pop":
          answer.append(queue.pop()).append("\n");
          break;
        case "size":
          answer.append(queue.size()).append("\n");
          break;
        case "empty":
          answer.append(queue.empty()).append("\n");
          break;
        case "front":
          answer.append(queue.front()).append("\n");
          break;
        case "back":
          answer.append(queue.back()).append("\n");
          break;

      }
    }

    System.out.println(answer);
  }

}


class Queue {

  private final List<Integer> buffer = new LinkedList<>();


  void push(int number) {
    buffer.add(number);
  }

  int pop() {
    if(buffer.isEmpty()) return -1;
    return buffer.remove(0);
  }

  int size() {
    return buffer.size();
  }

  int empty() {
    return buffer.isEmpty() ? 1 : 0;
  }

  int front() {
    if(buffer.isEmpty()) return -1;
    return buffer.get(0);
  }

  int back() {
    if(buffer.isEmpty()) return -1;
    return buffer.get(buffer.size() - 1);
  }



}
