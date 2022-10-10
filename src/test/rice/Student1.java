package test.rice;

public class Student1 extends LunchMenu{
	
//	public Student1(String menu1, String menu2) {
//		super(menu1, menu2);
//	}
//	public Student1(String menu1, String menu2,String menu3) {
//		super(menu1, menu2,menu3);
//	}
//	public Student1(String menu1, String menu2,String menu3,String menu4) {
//		super(menu1, menu2,menu3,menu4);
//	}
	public Student1(String menu1, String menu2,String menu3,String menu4,String menu5) {
		super(menu1, menu2,menu3,menu4,menu5);
	}
	
	@Override
	void MentCulator() {
		System.out.println("Student1식비는 "+super.basicMenu+"원 입니다.");
	}
}
