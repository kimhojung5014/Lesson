package test.jumsu;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JMenu;

public class Test2sort {

	public static void main(String[] args) {
		
		
		int[] jumsu;
		int sum = 0;
		int max;
		int min,tmp;
		float avg = 0;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사람 수는 몇명: ");
		int person = scanner.nextInt();
		
		jumsu = new int[person];
		if(person <2) {
			System.out.println("2명 이상 입력해주세요");
		}
		else {
				
			for(int i=0;i<jumsu.length;i++) {
				
				System.out.print((i+1)+"번의 점수 :");
				jumsu[i] = scanner.nextInt();
				sum += jumsu[i];		
			}
		
		
		Arrays.sort(jumsu);
		min = jumsu[0];
		max = jumsu[jumsu.length-1];
		avg = (float)sum / jumsu.length;
		
		System.out.println("합계는 "+sum+"점 입니다.");
		System.out.println("평균은  "+avg+"점 입니다.");
		System.out.println("최고점은 "+max+"점 입니다");
		System.out.println("최저점은 "+min+"점 입니다");
		
		}//else
		
	}

}
