package com.thisisjava.chap13.genmethod;

public class Util {
	public static <K,V> boolean compare(Pair<K,V> pair1, Pair<K,V> pair2) {
		
		if(pair1.getKey().equals(pair2.getKey()) 
				&& pair1.getValue().equals(pair2.getValue()))
			return true;
		else return false;
	}
}
