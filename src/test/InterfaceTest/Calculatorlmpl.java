package test.InterfaceTest;

public class Calculatorlmpl implements Calculator{

	@Override
	public long add(long n1, long n2) {
		
		return n1+n2;
	}

	@Override
	public long subtract(long n1, long n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public long multiply(long n1, long n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	@Override
	public long divide(double n1, double n2) {
		// TODO Auto-generated method stub
		return (long) (n1/n2);
	}

	

}
