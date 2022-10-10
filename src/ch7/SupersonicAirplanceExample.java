package ch7;

public class SupersonicAirplanceExample {

	public static void main(String[] args) {
		Superairplane sa = new Superairplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = Superairplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = Superairplane.NOMAL;
		sa.fly();
		sa.land();
		
	}

}
