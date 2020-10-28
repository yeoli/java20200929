package chap18.textbook.s180703;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("172.30.1.36", 5001));
			System.out.println("[연결 성공]");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
		try {
			socket.close();
		} catch(IOException e1) {
			e1.printStackTrace();
		}
	}
  }
}