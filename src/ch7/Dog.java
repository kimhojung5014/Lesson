package ch7;

public class Dog extends Animal{
	 
	public Dog() {
		super.kind = "강아지";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	 
	
}
