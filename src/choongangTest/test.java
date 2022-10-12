package choongangTest;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class test {
	
	private static void method(int r) {
		System.out.println("원의 면적:"+Math.PI*r*r);
	}

	public static void main(String[] args){
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j] ) {
					i--;
					break;
				}
			}
		System.out.println(lotto[i]);
		}
//		int a=5,b=5,aa,bb;
//		aa = ++a;
//		bb = b++;
//		System.out.println("aa = "+aa+" bb = "+bb);
//		System.out.println("a = "+a+" b= "+b);
//		int c = 10;
//		System.out.println(c++);
//		System.out.println(++c);
//		System.out.println(c);
//		
//		//1번에 3번 문자열 추출 
//		String str = "love your self";
//		System.out.println(str.substring(5,9));
//		
//		//1.배열
//		String[] strings = new String[5];
//		System.out.println("배열 크기"+strings.length);
//		//2.원의 면적
//		int r = 10;
//		System.out.println("원의 둘레:"+Math.PI*2*r);
//		
//		//3.pi함수
//		int rr = 10;
//		method(rr);
//		
		//4.주민번호
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민번호 입력: ");
		String[] number = scanner.nextLine().split("-");
		String foward = "\\d{6}";  // 역슬래쉬 조심
		String back = "\\d{7}";     // 역슬래쉬 조심
		
		if(!Pattern.matches(foward, number[0]) || !Pattern.matches(back, number[1])) {
			System.out.println("잘못된 주민번호 입력");
		}else {
			System.out.println("올바른 주민번호");
		}
		scanner.close();
//		
//		
//		// 5.로또 번호
//		ArrayList<Integer>lotto = new ArrayList<Integer>();
//		int tmp = 0;
//		
//		while(true) {
//			tmp = (int)(Math.random()*45)+1;  //random () 괄호 까먹지 말기
//			if(!lotto.contains(tmp)) {
//			lotto.add(tmp);
//			}
//			if(lotto.size()==6) {break;}
//		}
//		System.out.println(lotto);
//		
//		//6.윤년 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도 입력: ");
//		int year = scanner.nextInt();
//		LocalDate date = LocalDate.of(year, 1, 1); // of 조심  date.of가아니라 LoxalDate.of다
//		if(date.isLeapYear()) {
//			System.out.println("윤년포함");
//		}else {
//			System.out.println("미포함");
//		}
//		sc.close();
		}
		
	
}
