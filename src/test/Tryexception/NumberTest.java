package test.Tryexception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberTest {

	public static void main(String[] args) throws InputException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 입력: ");
		String num = scanner.next();
		String pattern1 = "\\d{4}";
		
	try {
		boolean result1 = Pattern.matches(pattern1, num);
		
		if(result1 == false) {
			throw new InputException("숫자가 아닙니다");
		}
		else {System.out.println("연도는 "+(num)+"년 입니다.");}
		}
		catch (InputException e) {		
		System.out.println(e.getMessage());
		} 
		
	}
	
}
