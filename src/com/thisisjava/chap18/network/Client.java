package com.thisisjava.chap18.network;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			InetSocketAddress server = new InetSocketAddress("192.168.0.34",10000);
			socket.connect(server);
			System.out.println("접속 성공!");
			
			BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			
			
			while(true) {
				System.out.print("전송 메시지 입력 ! :");
				String message = console.readLine();
				if(message.equals("EXIT") ) {
					System.out.println("접속 종료");
					break;
				}
				bw.write(message);
				bw.newLine();
				bw.flush();
				
				message = br.readLine();
				System.out.println("ECHO : " + message);
				
			}
			bw.close();
			br.close();
			console.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
