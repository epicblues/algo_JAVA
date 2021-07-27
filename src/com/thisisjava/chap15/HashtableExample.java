package com.thisisjava.chap15;
import java.util.*;
public class HashtableExample {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		
		while (true) {
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine();
			
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine();
			
			boolean isMember = false;
			
			for(Map.Entry<String, String> entry : entrySet) {
				if (entry.getKey().equals(id) && entry.getValue().equals(pw)) {
					System.out.printf("로그인이 성공하였습니다%n id : %s pw : %s%n",
							id,pw);
					isMember = true;
					break;
				}
			}
			
			if (isMember) {
				break;
			} else System.out.println("틀렸습니다. 다시 로그인 창으로 돌아갑니다!\n\n");
			
		}
		sc.close();
	}
}
