package test.person;

public class Female extends Perseon{
	String sexxx;
	
	public Female(String name,String personNumber,String sexxx) {
		super(name, personNumber);
		this.sexxx = sexxx;
	}
	
	@Override
	public void hello() {
		System.out.println("안녕하세요. 저는 "+name+"입니다. 주민등록번호는 "+personNumber+"입니다.");
		System.out.println("저는 "+sexxx+"입니다.");
	}
}
