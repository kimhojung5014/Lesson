package test.interfaceEx;

public class BPhone implements IFunction{
	@Override
	public void printModel() {
		System.out.println("B Phone");
	}
	@Override
	public void CanTell() {
		System.out.println("전화 가능합니다.");
	}
	@Override
	public void internet() {
		System.out.println("가능합니다. 5g입니다.");
	}
	@Override
	public void tv() {
		System.out.println("탑재 되어 있습니다.");
	}
}
