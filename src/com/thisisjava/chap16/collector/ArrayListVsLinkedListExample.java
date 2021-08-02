package com.thisisjava.chap16.collector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample {

	public static void work(int value) {
		
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
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i<1000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		long arrayListListParallel = testParallel(arrayList);
		long linkedListParallel = testParallel(linkedList);
		
		if(arrayListListParallel < linkedListParallel) {
			System.out.println("ArrayList");
		} else {
			System.out.println("LinkedList");
		}

	}

}
