package ch6;

public class CalculatorEx {

	public static void main(String[] args) {
		
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		System.out.println();
		
		Calculator calculator = new Calculator();
		System.out.println("객체 생성:"+calculator.pi*100);
		System.out.println("객체 생성:"+calculator.plus(10, 5));
		System.out.println("객체 생성:"+calculator.minus(10, 5));
		
	}

}
