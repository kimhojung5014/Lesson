package test.account;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계좌정보를 입력하세요");
		System.out.print("계좌명의: ");
		String name = scanner.next();
		
		System.out.print("계좌번호: ");
		String num = scanner.next();
		
		System.out.print("잔고: ");
		int balancd = scanner.nextInt();
		
		Account account = new Account(name, num, balancd);
		System.out.println(account);
		
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		account.withdraw(money);
		
		
	}

}
