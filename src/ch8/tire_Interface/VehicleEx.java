package ch8.tire_Interface;


public class VehicleEx {

	public static void main(String[] args) {
			Driver driver = new Driver();
			driver.drive(new Bus());
			driver.drive(new Taxi());
	}

}
