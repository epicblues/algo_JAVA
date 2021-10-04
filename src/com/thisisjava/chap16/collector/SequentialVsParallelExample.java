package com.thisisjava.chap16.collector;

import java.util.Arrays;
import java.util.List;

public class SequentialVsParallelExample {

	// 요소 처리
	
	public static void work(int value) {
		try {Thread.sleep(1000);} catch(Exception e) {}
	}
	
	public static long testSequencial(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runTime = end - start;
		return runTime;
	}
	
	
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runTime = end - start;
		return runTime;
	}
	
	
	public static void main(String[] args) {
		// 소스 컬렉션
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		// 순차 스트림 처리 시간 구하기
		System.out.println("순차 스트림 : "+testSequencial(list));
		
		// 병렬 스트림 처리 시간 구하기
		System.out.println("병렬 스트림 : " +testParallel(list));

	}

}
