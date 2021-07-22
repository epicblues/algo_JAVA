package com.thisisjava.chap8.tire;

public class Car {
	
	Tire[] tires = {new HankookTire(),new HankookTire(),new HankookTire(),new HankookTire()};
	
	
	
	
	void run () {
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
	}
	
	
}
