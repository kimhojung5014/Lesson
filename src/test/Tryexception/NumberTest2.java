package test.Tryexception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberTest2 {

	public static void main(String[] args) throws InputException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 입력: ");
		String id = scanner.nextLine().trim();
		
		
		String pattern1 = "\\w*[a-zA-Z]+\\d+\\w*";
		
		String pattern2 = "\\w*\\d+[a-zA-Z]+\\w*";
		
	
		
		boolean result1 = Pattern.matches(pattern1, id);
		boolean result2 = Pattern.matches(pattern2, id);
		
	try {
		if(result1 == false && result2 == false  ) {
			throw new InputException("잘못된 값입니다.");
		}
		else {System.out.println("ID는 "+(id)+"입니다.");}
		}
		catch (InputException e) {		
		System.out.println(e.getMessage());
		} 
		
	}
	
}