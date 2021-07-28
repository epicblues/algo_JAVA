package com.thisisjava.chap15.practice;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		map.put("heel", 106);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			if(entry.getValue()>maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		
		System.out.println("평균점수: " + (totalScore / map.size()));
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}
