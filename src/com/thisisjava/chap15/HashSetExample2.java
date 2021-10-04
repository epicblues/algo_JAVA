package com.thisisjava.chap15;
import java.util.*;
public class HashSetExample2 {

	public static void main(String[] args) {
		
		Set<Board> set = new HashSet<>();
		
		set.add(new Board("수학", "문풀", "문프"));
		set.add(new Board("수학", "문풀", "핵프"));
		set.add(new Board("수학", "문풀", "치프"));
		set.add(new Board("수학", "문풀", "박프"));
		set.add(new Board("영어", "문풀2", "김커수"));
		set.add(new Board("국어", "문풀3", "허수"));
		set.add(new Board("컴퓨터", "문풀4", "서오릉피자"));
		set.add(new Board("과학", "문풀5", "갈비"));
		
		System.out.println(set.size());
		
		
		
	}

}
