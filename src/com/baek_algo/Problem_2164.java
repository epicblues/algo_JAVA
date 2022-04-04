package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Problem_2164 {

	public static void main(String[] args) throws IOException {

		String input = new BufferedReader(new InputStreamReader(System.in)).readLine();

		int N = Integer.parseInt(input);

		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			deque.push(N - i);
		}

		while (deque.size() > 1) {
			deque.pop();
			deque.offerLast(deque.pop());

		}

		System.out.println(deque.pop());

	}

}
