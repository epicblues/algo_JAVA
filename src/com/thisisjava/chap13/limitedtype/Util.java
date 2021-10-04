package com.thisisjava.chap13.limitedtype;

public class Util {
	public static <T extends Number> int compare(T num1, T num2) {
		double dnum1 = num1.doubleValue();
		double dnum2 = num2.doubleValue();
		return Double.compare(dnum1, dnum2);
	}
}
