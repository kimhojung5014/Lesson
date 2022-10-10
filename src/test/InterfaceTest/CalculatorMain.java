package test.InterfaceTest;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculatorlmpl();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계산할  두 수를 입력하세요: ");
		System.out.print("NUM1: ");
		int num1 = scanner.nextInt();
		System.out.print("NUM2: ");
		int num2 = scanner.nextInt();
		System.out.println("합은 :"+calculator.add(num1	, num2)); 
		
		
		System.out.println("뺄셈은 :"+calculator.subtract(num1	, num2)); 
		
		
		System.out.println("곱셈은 :"+calculator.multiply(num1	, num2)); 
		
		
		System.out.println("나눗셈은 :"+calculator.divide(num1	, num2)); 
		
	}

}
