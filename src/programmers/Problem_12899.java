package programmers;

import java.util.List;

public class Problem_12899 {
	public String solution(int n) {
		// 사실상 3진법
		// 3진법이
		// 3으로 나눴을 때 나머지가 0이 아닐 때까지 계속 3을 나눈다
		// 나머지가 0일 때마다 count를 높인다.
		var answer = new StringBuilder();
		var list = List.of("1", "2", "4");
		// 1. 최대 자리 수 구하기
		int count = 0;
		int temp = n;
		while (temp / 3 > 0) {
			temp = temp / 3;
			count++;
		}

		int maxShare = (int)Math.pow(3, count);
		int remainder = n % maxShare;
		if (remainder == 3) {
			answer.append(4);
		} else {
			answer.append(remainder);
		}

		return answer.toString();

	}
}
