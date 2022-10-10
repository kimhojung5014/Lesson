package ch7;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver =new Driver();
		bus b = new bus();
		taxi t = new taxi();
		
		driver.drive(b);
		driver.drive(t);
		
		Vehicle vehicle = b;
		Vehicle vehicle2 = t;
		
		driver.drive(vehicle);
		driver.drive(vehicle2);
		
	}

}
