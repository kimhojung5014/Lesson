package ch7;

public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void intersearch() {
		System.out.println("인터넷검색을합니다.");
	}
}
