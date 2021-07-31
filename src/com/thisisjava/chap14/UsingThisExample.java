package com.thisisjava.chap14;

public class UsingThisExample {

	public static void main(String[] args) {
		UsingThis usingthis = new UsingThis();
		UsingThis.Inner inner = usingthis.new Inner();
		
		inner.method();

	}

}
