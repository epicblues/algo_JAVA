package com.thisisjava.chap14;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	private static int[] scores = { 92, 95, 87,99,100,224,1,5,-5,200 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int maxOrMin = scores[0]; // 시작 값 설정.
		for (int i = 1; i < scores.length; i++) {
			maxOrMin = operator.applyAsInt(maxOrMin, scores[i]); // 람다식에 따라 비교 방식이 달라진다. 매 연산 마다 최소/최대 값이 바뀐다.
		}

		return maxOrMin;
	}

	public static void main(String[] args) {
		System.out.println("최대값 : " + maxOrMin((x, y) -> x >= y ? x : y));
		System.out.println("최소값 : " + maxOrMin((x, y) -> x < y ? x : y));

	}

}
