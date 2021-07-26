package com.thisisjava.chap13.inherit;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		Storage<ChildProduct<Tv,String,String>> storage = 
				new StorageImpl<ChildProduct<Tv,String,String>>(100);
		
		storage.add(product, 3);
		ChildProduct<Tv, String, String> product3 =storage.get(3);
			

	}

}
