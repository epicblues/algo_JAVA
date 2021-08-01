package com.thisisjava.chap14.andthencompose;

import java.util.function.*;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		IntPredicate chkMul2 = x -> x % 2 == 0 ? true : false;
		IntPredicate chkMul3 = x -> x % 3 == 0 ? true : false;

		// And()

		IntPredicate chkMul6 = chkMul2.and(chkMul3);

		// Or()

		IntPredicate chkOr = chkMul2.or(chkMul3);

		// negate()

		IntPredicate chkNotMul2 = chkMul2.negate();

		System.out.println("9은 6의 배수인가? " + chkMul6.test(9));

		System.out.println("9는 2또는 3의 배수인가? " + chkOr.test(9));
		System.out.println("9는 2의 배수가 아닌가? " + chkNotMul2.test(9));

	}

}
