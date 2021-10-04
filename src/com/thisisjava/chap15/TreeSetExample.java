package com.thisisjava.chap15;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		score = scores.floor(199);
		System.out.println("199와 가까운 점수 : " + score);
		score = scores.ceiling(81);
		System.out.println("81보다 높게 가까운 점수 : " + score);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 개수 : " + scores.size() + ")");
		}
		
		
		
		
		
	
	}

}
