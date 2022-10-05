package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		var nums = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		// 누적 합 저장

		var table = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			table[i] = table[i - 1] + nums[i - 1];
		}

		var answer = new StringBuilder();
		for (int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			answer.append(table[j] - table[i - 1]).append("\n");
		}
		answer.delete(answer.length() - 1, answer.length());
		System.out.println(answer);
	}
}
