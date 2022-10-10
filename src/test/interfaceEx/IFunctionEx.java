package test.interfaceEx;

public class IFunctionEx {

	public static void main(String[] args) {
		IFunction iFunction = new APhone();
		iFunction.printModel();
		iFunction.CanTell();
		iFunction.internet();
		iFunction.tv();
		System.out.println("--------------------------");
		iFunction = new BPhone();
		iFunction.printModel();
		iFunction.CanTell();
		iFunction.internet();
		iFunction.tv();	
		System.out.println("--------------------------");
		iFunction = new CPhone();
		iFunction.printModel();
		iFunction.CanTell();
		iFunction.internet();
		iFunction.tv();
		System.out.println("--------------------------");
		
		IFunction[] iFunction1 = {new APhone(),new BPhone(),new CPhone()};
		
		for(IFunction tmp:iFunction1) {
			tmp.printModel();
			tmp.CanTell();
			tmp.internet();
			tmp.tv();
			System.out.println("--------------------------");
		}
				
		
	}

}
