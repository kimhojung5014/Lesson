package test.Tryexception;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberTest3 {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("아이디 입력: "); 
			String id = sc.nextLine();
			byte[] bytes = id.getBytes();
			for(int i=0;i<bytes.length;i++) {
				if(bytes[i]>=48&&bytes[i]<=57 || bytes[i]>=65&&bytes[i]<=90 || bytes[i]>=97&&bytes[i]<=122 || bytes[i]!=32) {
					continue;
				}else throw new InputException("잘못된 값입력");
			}
			System.out.println("ID는"+id);
			
				
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		
		
		
		
	}
	
}