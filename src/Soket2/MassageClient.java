package Soket2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MassageClient {

	public static void main(String[] args) throws Exception{
			Socket s = new Socket("172.30.1.45",8888);
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			Scanner sc = new Scanner(System.in);
			
			String str = "",str2 = "";
			
			while(!str.equals("exit")) {
				str = sc.nextLine();
				dout.writeUTF(str);
				dout.flush();
				str2 = din.readUTF();
				System.out.println("서버 메세지:"+str);
			}
			din.close();
			s.close();
			
	}

}
