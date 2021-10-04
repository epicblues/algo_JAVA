package com.thisisjava.chap13;

public class ProductExample {

	public static void main(String[] args) {
		Product<Car,String> product = new Product<>();
		product.setKind(new Car());
		product.setModel("그랜저");
		
		System.out.println(product.getKind());
		
		Product<Tv,String> product2 = new Product<>();
		
		product2.setKind(new Tv());
		product2.setModel("그랜저");
		
		System.out.println(product2.getKind());

	}

}
