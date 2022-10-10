package ch11.StringTokenizer;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		String str1 = "오늘의 점심은 떡볶이 입니다. 튀김도 같이 먹습니다.";
		String str2 = "2022/09/27";
		String str3 = "가/나!다#";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		StringTokenizer tokenizer1 = new StringTokenizer(str1);
		StringTokenizer tokenizer2 = new StringTokenizer(str2,"/");
		StringTokenizer tokenizer3 = new StringTokenizer(str3,"!|/|#");
		
		System.out.println("tokenizer1: " + tokenizer1.countTokens());
		System.out.println("tokenizer2: "+ tokenizer2.countTokens());
		System.out.println("tokenizer3: "+ tokenizer3.countTokens());
		
		while(tokenizer1.hasMoreTokens()) {
			System.out.print(tokenizer1.nextToken());
		}
		System.out.println();
		while(tokenizer2.hasMoreTokens()) {
			System.out.print(tokenizer2.nextToken());
		}
		System.out.println();
		while(tokenizer3.hasMoreTokens()) {
			System.out.print(tokenizer3.nextToken());
		}
	
	}

}
