package Soket;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("172.30.1.45",9999);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("배달왔습니다.호중");
			dout.flush();
			dout.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
