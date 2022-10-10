package test.person;

public class PersonExmple {

	public static void main(String[] args) {
		Male male = new Male("김호동", "1234-5678", "남자");
		Female female = new Female("김호순", "0000-2222", "여자");
		male.hello();
		System.out.println("===============================");
		female.hello();
		System.out.println("===============================");
		Perseon perseon00 = new Perseon("00년생", "00");
		perseon00.hello();
		System.out.println("===============================");
		Perseon perseon90 = new Perseon("96년생", "96");
		perseon90.hello();
	}

}
