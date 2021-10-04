package com.thisisjava.chap6;

public class ShopService {
	
	private static ShopService abc = new ShopService(); // 유일하 ShopService 객체의 주소를 return 한다.
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return abc;
	}
	
	
}
