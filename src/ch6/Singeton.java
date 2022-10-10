package ch6;

public class Singeton {
	private static Singeton singeton = new Singeton();
	
	private Singeton() {}
	
	static Singeton getInstance() {
		return singeton;
	}
}	
