package test.interfaceEx;

public class APhone implements IFunction{
	@Override
	public void printModel() {
		System.out.println("A Phone");
	}
	@Override
	public void CanTell() {
		System.out.println("전화 가능합니다.");
	}
	@Override
	public void internet() {
		System.out.println("불가능합니다. 3g입니다.");
	}
	@Override
	public void tv() {
		System.out.println("미탑재 되어 있습니다.");
	}
}
