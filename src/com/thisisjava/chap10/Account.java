package com.thisisjava.chap10;

public class Account {
	private long balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if (money > balance) {
			throw new BalanceInsufficientException("잔고가 부족합니다! " + 
		(money - balance) + "만큼 넣어 줘야 합니다!");
		} else {
			balance -= money;
		}
	}
	
}
