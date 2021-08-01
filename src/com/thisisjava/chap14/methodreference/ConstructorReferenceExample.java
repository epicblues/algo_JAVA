package com.thisisjava.chap14.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Function<String, Member> function1 = str -> new Member(str);
		Member member = function1.apply("angel");
		System.out.println(member.getId());

		function1 = Member::new;
		member = function1.apply("angel2");
		System.out.println(member.getId());

		BiFunction<String, String, Member> function2 = (str1, str2) -> new Member(str1, str2);

		member = function2.apply("신천사", "angel");
		System.out.println(member.getId() + " " + member.getName());

		function2 = Member::new;
		member = function2.apply("신천사2", "angel2");
		System.out.println(member.getId() + " " + member.getName());
	}

}
