package com.thisisjava.chap10;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
		// TODO Auto-generated constructor stub
	}
	public NotExistIDException(String message) {
		super(message);
	}
}

class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		// TODO Auto-generated constructor stub
	}
	public WrongPasswordException(String message) {
		super(message);
	}
}
