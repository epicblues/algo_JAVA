package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] target = new int[2];
		int i = 0;
		for (String s : br.readLine().split(" ")) {
			target[i] = Integer.parseInt(s);
			i++;
		}
		int GCM = getGCM(target[0], target[1]);
		int LCM = getLCM(target[0], target[1]);

		System.out.println(GCM + "\n" + LCM);

	}

	private static int getLCM(int n1, int n2) {
		int a = 1;
		int b = 1;

		while (n1 * a != n2 * b) {
			if (n1 * a > n2 * b) {

				b++;
				continue;
			}

			a++;
		}

		return n1 * a;

	}

	static int getGCM(int a, int b) {
		if (b == 0)
			return a;
		return getGCM(b, a % b);

	}
}
