package com.practice.clone;

public class Sample implements Cloneable {
	@Override
	public Sample clone() {
		try {
			return (Sample)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
