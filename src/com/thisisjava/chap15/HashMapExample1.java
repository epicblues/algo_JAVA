package com.thisisjava.chap15;

import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 entry 수 : " + map.size());
		System.out.println();
		
		// 객체 찾기
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key + "의 점수 : " + map.get(key));
		}
		System.out.println();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + "의 점수 : " + map.get(key));
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 entry 수 : " + map.size());

		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + "의 점수 : " + entry.getValue());
		}
		System.out.println();

		// 객체 전체 삭제
		map.clear();

		System.out.println("총 entry 수 : " + map.size());

	}

}
