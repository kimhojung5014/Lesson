package test.Tryexception;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberTest4 {
	static byte[] input = new byte[100];
	

	public static void main(String[] args) throws IOException{
	
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("아이디 입력: "); 
			String id = sc.nextLine().trim();
		
		
			 throw new InputException("잘못된 값입력");
			
//			System.out.println("ID는"+id);
			
				
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		
		
		
		
	}
	
}