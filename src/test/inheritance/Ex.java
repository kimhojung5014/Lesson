package test.inheritance;

public class Ex {

	public static void main(String[] args) {
		Copy1 copy1 = new Copy1();
		copy1.memu();
		System.out.println("=================");
		
		Copy2 copy2 = new Copy2();
		copy2.memu();	
		
		System.out.println("=================");
		Copy3 copy3 = new Copy3();
		copy3.memu();
	}

}
