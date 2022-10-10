package ch7;

public class Smartphonemain {

	public static void main(String[] args) {
//		Phone phone = new Phone("홍길동");
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.intersearch();
	}

}
