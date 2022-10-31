package com.sy.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		//자기 컴퓨터에 전송하실 분은 127.0.0.1 입니다.
		try(Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
				Scanner sc = new Scanner(System.in);) {
			
			while(true) {
				System.out.print("보낼 메시지:");
				String message = sc.nextLine();
				
				//메시지 보내기
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println(message + "\n");
				pw.flush();
				
				//메시지 받기
				BufferedReader br = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				String response = br.readLine();
				System.out.println(response);
				
				//정리 작업
				br.close();
				pw.close();
				
				
			}
		} catch(Exception e) {
			
		}
	}
}
