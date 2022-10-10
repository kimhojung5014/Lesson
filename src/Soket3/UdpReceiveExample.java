package Soket3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveExample {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket(5001);
		Thread thread = new Thread() {
			public void run() {
				System.out.println("수신시작");
				try {
					while(true) {
						DatagramPacket  Packet = new DatagramPacket(new byte[100],100);
						datagramSocket.receive(Packet);
						String data = new String(Packet.getData(),0,Packet.getLength(),"UTF-8");
						System.out.println("[받은 내용:"+Packet.getSocketAddress()+"]"+data);
					}
				}catch (Exception e) {
					System.out.println("수신종료");
					// TODO: handle exception
				}
			}
		};
		thread.start();
		Thread.sleep(10000);
		datagramSocket.close();
	}

}
