package com.thisisjava.chap15;
import java.util.*;


public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(98);
		scores.add(87);
		scores.add(95);
		scores.add(75);
		scores.add(80);
		
		Iterator<Integer> descIterator = scores.descendingIterator();
		while(descIterator.hasNext()) {
			System.out.println("추출된 숫자 : " + descIterator.next());
		}
		
		NavigableSet<Integer> descScores = scores.descendingSet();
		
		for(Integer num : descScores) {
			System.out.println("descendingSet num : " + num);
		}
		
		NavigableSet<Integer> ascScores = scores.descendingSet().descendingSet();
		for(Integer num : ascScores) {
			System.out.println("ascendingSet num : " + num);
		}
		
		
	}

}
