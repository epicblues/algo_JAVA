package com.thisisjava.chap11;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0000000000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###########.##########");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0000000000E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ;-#,##");
		System.out.println(df.format(num));
		System.out.println(df.format(-num));
		
		df = new DecimalFormat("#.0%");
		System.out.println(df.format(1));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
	}

}
