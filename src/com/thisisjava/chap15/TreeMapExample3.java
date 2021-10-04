package com.thisisjava.chap15;

import java.util.Map;
import java.util.NavigableMap;

import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 10);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
	
		NavigableMap<String,Integer> navMap = treeMap.subMap("c", false, "f", false);
		
		System.out.println("[c~f 사이의 단어 검색]");
		while(!navMap.isEmpty()) {
			Map.Entry<String, Integer> entry = navMap.pollFirstEntry();
			System.out.printf(" 단어 : %s\t숫자 : %d\t남은 entry : %d%n",
					entry.getKey(),
					entry.getValue(),
					navMap.size()
					);
		}

	}

}
