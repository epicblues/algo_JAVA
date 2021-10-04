package com.thisisjava.chap9.q4;

public class Chatting {
	
	void startChat(String chatId) {
		final String nickName = chatId;
		
		Chat chat = new Chat() {
			int chatLimit = 0;
			@Override
			public void start() {
				while (chatLimit <10) {
					String inputData = "안녕하세요.";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
					chatLimit++;
				}
				
			}

			@Override
			void sendMessage(String message) {
				System.out.println(message);
				
			}
		};
		
		chat.start();
	}
}

abstract class Chat {
	abstract void start();
	abstract void sendMessage(String message);
}