package com.thisisjava.chap14.andthencompose;

import java.util.function.*;


public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		
		Function<Member, Address> getAddress = member -> member.getAddress();
		Function<Address, String> getCity = address -> address.getCity();
		
		Function<Member,String> getMemberCity = getAddress.andThen(getCity);
		
		Function<Member,String> getMemberCityCom = getCity.compose(getAddress);
		
		
		String city = getMemberCity.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		
		System.out.println("거주 도시 : " + city);
		
		city = getMemberCityCom.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시 : " + city);
		
		

	}

}
