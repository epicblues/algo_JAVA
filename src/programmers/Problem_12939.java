package programmers;

import java.util.Arrays;

public class Problem_12939 {

  public String solution(String s) {
    var numbers = Arrays.stream(s.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
    Arrays.sort(numbers);

    StringBuilder answer = new StringBuilder();
    answer.append(numbers[0])
        .append(" ")
        .append(numbers[numbers.length - 1]);

    return answer.toString();
  }

}
