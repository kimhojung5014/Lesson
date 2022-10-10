package ch7;

public abstract class Animal {
	String kind;
	
	Animal(){
		this.kind = "포유류";
	}
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
