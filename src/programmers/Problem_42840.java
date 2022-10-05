package programmers;

import java.util.LinkedList;

public class Problem_42840 {

  int[] answerArr;

  public int[] solution(int[] answers) {
    answerArr = answers;

    int[] counter = new int[3];

    var secondTable = new int[]{1, 3, 4, 5};
    var thirdTable = new int[]{3, 1, 2, 4, 5};

    for (int i = 0; i < answers.length; i++) {

      int firstChecker = (i + 1) % 5;
      if (firstChecker == 0) {
        firstChecker = 5;
      }

      if (answers[i] == firstChecker) {
        counter[0]++;
      }

      int secondChecker;
      if (i % 2 == 0) {
        secondChecker = 2;
      } else {
        // 1,3,4,5 반복
        int candidate = ((i - 1) / 2) % 4;
        secondChecker = secondTable[candidate];
      }

      if (answers[i] == secondChecker) {
        counter[1]++;

      }

      int thirdChecker = thirdTable[(i / 2) % 5];

      if (answers[i] == thirdChecker) {
        counter[2]++;
      }
    }
    int max = 0;

    for (int count : counter) {
      max = Math.max(max, count);
    }
    var answerList = new LinkedList<Integer>();
    for (int i = 0; i < counter.length; i++) {
      if (max == counter[i]) {
        answerList.add(i + 1);
      }
    }

    return answerList.stream().mapToInt(i -> i).toArray();
  }

}
