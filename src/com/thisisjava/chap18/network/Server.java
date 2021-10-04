package com.thisisjava.chap18.network;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket();
			InetSocketAddress ip = new InetSocketAddress("192.168.0.34",10000);
			serverSocket.bind(ip);
			while(true) {
			
			socket = serverSocket.accept();
			System.out.println("소켓 생성!");
			ServerThread thread = new ServerThread(socket);
			thread.start();
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
