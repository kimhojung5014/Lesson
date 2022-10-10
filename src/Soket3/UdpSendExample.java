package Soket3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {

	public static void main(String[] args) throws Exception{
		DatagramSocket datagramSocket = new DatagramSocket();
		
		System.out.println("[발신시작]");
		
		for(int i=0;i<3;i++) {
			String data = "호중"+i;
			byte[] bytearr = data.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(bytearr,bytearr.length,
					new InetSocketAddress("172.30.1.5",5001));
			datagramSocket.send(packet);
			System.out.println("[보낸 바이트수] :" +bytearr.length+"bytes");
			
		}
		System.out.println("[발신종료]");
		datagramSocket.close();
	}

}
