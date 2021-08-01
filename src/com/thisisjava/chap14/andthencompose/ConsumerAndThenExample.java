package com.thisisjava.chap14.andthencompose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

	public static void main(String[] args) {

		Consumer<Member> printName = member -> System.out.println(member.getName());
		
		Consumer<Member> printId = member -> System.out.println(member.getId());
		
		Consumer<Member> printInfo = printName.andThen(printId);
		
		printInfo.accept(new Member("홍길동", "hong", null));

	}

}
