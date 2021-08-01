package com.thisisjava.chap14.andthencompose;

import java.util.Comparator;
import java.util.function.*;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {

		BinaryOperator<Fruit> operator;
		Fruit fruit;
//		
//		operator = BinaryOperator.maxBy( new Comparator<Fruit>(){
//
//			@Override
//			public int compare(Fruit o1, Fruit o2) {
//				return Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
//			}
//			
//		});

		operator = BinaryOperator.maxBy((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice()));

		fruit = operator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));

		System.out.println("최대값 : " + fruit.getName());

		operator = BinaryOperator.minBy((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice()));
		fruit = operator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println("최소값 : " + fruit.getName());

	}

}

class Fruit {
	private String name;
	private int price;

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
