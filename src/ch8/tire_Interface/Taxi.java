package ch8.tire_Interface;

public class Taxi implements vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
