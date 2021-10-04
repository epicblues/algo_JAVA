package com.thisisjava.chap15;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendmail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message msg = messageQueue.poll();
			switch(msg.command) {
			case "sendmail":
				System.out.println(msg.to + "에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(msg.to + "에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(msg.to + "에게 카카오톡을 보냅니다.");
			
			}
		}
	}
	

}
