package com.thisisjava.chap18.network;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
public class ServerThread extends Thread{
	private Socket socket;

	public ServerThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
		System.out.println("접속 완료 " +  socket.getLocalSocketAddress());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		String message;
		while (true) {
			if((message = br.readLine()) == null) {
				System.out.println("접속 종료");
				break;
			}
			System.out.println("전송 받은 메시지 : " + message);
			bw.write(message);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
		socket.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
