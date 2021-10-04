package com.thisisjava.chap10;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		Scanner scan = new Scanner(System.in);
		while (true) {
		System.out.print("잔고를 넣어주세요! > ");
		account.deposit(scan.nextInt());
		
		
			try {
				account.withdraw(6000);
			} catch (BalanceInsufficientException e) {
				
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		
		System.out.println("잔고 = " + account.getBalance());
		}
	}

}
