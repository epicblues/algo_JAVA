package com.thisisjava.chap15;
import java.util.*;
public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size= set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("element : " + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " + set.size());
		
		iterator = set.iterator(); // set가 변경되었으므로 그 상황을 반영한 새로운 반복자 객체 연결.
		for(String str : set) {
			System.out.println("element : " + str);
		}
		
		set.clear();
		
		System.out.println(set.isEmpty() ? "비어 있음" : "아직 남았다!");
	}

}
