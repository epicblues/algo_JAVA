package com.thisisjava.chap16.collector;

public class Student {
	public enum Sex {
		MALE, FEMALE
	};

	public enum City {
		Seoul, Pusan
	};

	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}

	private Sex sex;
	private City city;

	public Student(String name, int score, Sex sex) {
		this(name, score, sex, null);

	}

	public Student(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;

	}

}
