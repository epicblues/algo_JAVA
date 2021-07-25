package com.thisisjava.chap11.classs;

public class ClassExample {
	public static void main(String args[]) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("com.thisisjava.chap11.classs.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

class Car {
	String model;
	

	String owner;
	
	public Car() {
		this("소나타", "김민성");
	}
	
	public Car(String model, String owner) {
		super();
		this.model = model;
		this.owner = owner;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
	
}