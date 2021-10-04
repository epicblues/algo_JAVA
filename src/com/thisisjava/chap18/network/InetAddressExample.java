package com.thisisjava.chap18.network;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터의 IP 주소 : " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remot : iaArr) {
				System.out.println("Naver의 IP 주소 : " + remot.getHostAddress());
			}
		
		} catch (java.net.UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
