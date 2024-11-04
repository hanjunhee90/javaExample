package ch16_network_chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("채팅방에 입장하려면 닉네임을 입력하세요:");
		String nm = scan.nextLine();
		try {
			Socket soc = new Socket("192.168.0.31", 9001);
			System.out.println("접속 성공!");
			// 데이터 수신
			SendThread send = new SendThread(soc, nm);
			ReceiveThread receive = new ReceiveThread(soc);
			send.start();
			receive.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
