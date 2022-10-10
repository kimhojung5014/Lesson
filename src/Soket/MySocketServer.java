package Soket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(9999);
			
			Socket s = ss.accept();
			
			DataInputStream dis =new DataInputStream(s.getInputStream());
			String str = (String)dis.readUTF();
			System.out.println("메세지:"+str);
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
}
