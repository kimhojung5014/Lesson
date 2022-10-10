package test.person;

public class Perseon {
	String name;
	String personNumber;
	
	public Perseon(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	
	
	
	public void hello() {
		String age = personNumber.substring(0,1);
		Integer age2 = Integer.parseInt(age);
//		System.out.println(age2);
		
		String age3 = personNumber.substring(1,2);
		Integer age4 = Integer.parseInt(age3);
//		System.out.println(age4);
		
		int age5 = (age2*10)+age4;
		int age6 = 2022-(1900+age5);
		int age7 = 2022-(2000+age4);
		
		if(age.equals("0")) {
			System.out.println("안녕하세요. 저는 "+name+"입니다. "+(age7+1)+"살 입니다.");	
			
		}else {
			System.out.println("안녕하세요. 저는 "+name+"입니다. "+(age6+1)+"살 입니다.");
		}
	}
}
