package com.thisisjava.chap15;
import java.util.Comparator;
public class DescendingComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		return -Integer.valueOf(o1.price).compareTo(o2.price);
	}
	
}

class Fruit {
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		this.name=name;
		this.price = price;
	}
}