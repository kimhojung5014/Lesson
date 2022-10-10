package ch6;

public class SingetonEx {

	public static void main(String[] args) {
//		Singeton obj3 = new Singeton();
//		Singeton obj4 = new Singeton();
		
		Singeton obj3 = Singeton.getInstance();
		Singeton obj4 = Singeton.getInstance();
		
		if(obj3 == obj4){
			System.out.println("같은 sington 객체입니다.");
		}else {
			System.out.println("다른 sington 객체입니다.");
		}
	}
}
