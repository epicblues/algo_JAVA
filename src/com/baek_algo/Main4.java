package com.baek_algo;

// 버퍼 문제풀이 템픞릿

import java.io.*;

public class Main4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] intAr = new int[9];
		int[] intArCopy = new int[9];
		for (int i = 0; i < 9; i++) {
			intAr[i] = Integer.parseInt(bf.readLine());
		}

		for (int i = 0; i < 9; i++) {
			intArCopy[i] = intAr[i];
		}

		for (int i = 0; i < 8; i++) {
			if (intArCopy[i] > intArCopy[i + 1]) {
				int temp = intArCopy[i];
				intArCopy[i] = intArCopy[i + 1];
				intArCopy[i + 1] = temp;
			}
		}

		int maxNum = intArCopy[8];
		int maxNumIndex = 0;

		for (int i = 0; i < 9; i++) {
			if (intAr[i] == maxNum) {
				maxNumIndex = i + 1;
				break;
			}
		}

		bw.write(maxNum + "\n" + maxNumIndex);
		bf.close();
		bw.flush();
		bw.close();

	}

}