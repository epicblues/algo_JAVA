package com.thisisjava.chap6;

public class Car {

	
	
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	int speed;
	int gas;
	// 필드
	
	
	public Car() {
		this("부바", "은색", 200);
	}; // 기본 생성자.

	public Car(String model) {
		this(model, "은색", 200);
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

	
	
	static int doom = 4;
	
	
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run1() {
		for(int i =10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속" + speed + "km/h");
		}
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas-=1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;
			}
		}
	}
	
	int sum(int... values) {
		int result=0;
		for(int value : values) {
			result += value;
		}
		return result;
	};

}
