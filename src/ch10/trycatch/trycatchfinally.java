package ch10.trycatch;

public class trycatchfinally {

	public static void main(String[] args) {
		String data1=null;
		String data2=null;
		try {
			data1=args[0];
			data2=args[1];
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값 수 부족");

		}
	}

}
