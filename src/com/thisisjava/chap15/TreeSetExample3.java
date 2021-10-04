package com.thisisjava.chap15;

import java.util.*;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("gues");
		treeSet.add("cherry");
		treeSet.add("fuck");
		
		
		System.out.println("c~f사이의 단어 검색 : ");
		NavigableSet<String> answer = treeSet.subSet("c", false, "fucl", true).descendingSet();
		
		for (String word : answer) {
			System.out.print(word + "\t");
		}
	}

}
