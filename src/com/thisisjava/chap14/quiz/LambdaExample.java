package com.thisisjava.chap14.quiz;

import java.util.function.*;

public class LambdaExample {
	private static int[] scores = {10, 50, 3,90,20,-1,50,40};
	
	public static int maxOrMin (IntBinaryOperator operator) {
		int result = scores[0];
		
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println("최대값 : " + maxOrMin(Integer::max));
		System.out.println("최소값 : " + maxOrMin(Integer::min));
	}
}
