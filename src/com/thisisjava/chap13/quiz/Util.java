package com.thisisjava.chap13.quiz;

public class Util {
	public static <K,V> V getValue(Pair<K,V> pair, K key) {
		if (key.equals(pair.getKey())) return pair.getValue();
		else return null;
	}
}
