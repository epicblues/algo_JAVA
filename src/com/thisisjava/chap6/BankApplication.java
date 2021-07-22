package com.thisisjava.chap6;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scan.nextInt();
			
			switch (selectNo) {
				case 1:
					createAccount();
					break;
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					run = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
			}
			
			
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
	}

	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호: " );
		Account depTarget = findAccount(scan.next());
		System.out.print("출금액: " );
		depTarget.setBalance(depTarget.getBalance() - scan.nextInt());
		System.out.println("결과: 출금이 성공되었습니다." );
		
	}

	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호: " );
		Account depTarget = findAccount(scan.next());
		System.out.print("예금액: " );
		depTarget.setBalance(depTarget.getBalance() + scan.nextInt());
		System.out.println("결과: 예금이 성공되었습니다." );
	}

	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		for(int i = 0; i < accountArray.length ; i++) {
			if(accountArray[i] == null) {
				break;
			}
			System.out.printf("%s   %s   %d%n",accountArray[i].getAno(),
					accountArray[i].getOwner(),
					accountArray[i].getBalance());
			
		}
		
		
	}

	private static void createAccount() {
		int newAccountIndex=0;
		for(int i = 0; i < accountArray.length ; i++) {
			if(accountArray[i] == null) {
				newAccountIndex = i;
				break;
			}
		}
		
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String ano = scan.next();
		System.out.print("계좌주: ");
		String owner = scan.next();
		System.out.print("초기입금액: ");
		int balance = scan.nextInt();
		accountArray[newAccountIndex] = new Account(ano, owner, balance);
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	private static Account findAccount(String ano) {
		for(int i = 0; i<accountArray.length;i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		} 
		
		System.out.println("찾는 계좌가 존재하지 않습니다.");
		return null;
		
	}
	
}
