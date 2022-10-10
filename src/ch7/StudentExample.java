package ch7;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "1234-6789", 100);
		System.out.println("이름: "+student.name);
		System.out.println("ssn: "+student.ssn);
		System.out.println("studentNo: "+student.studentNo);
		System.out.println();
		
		People people = new People();
		System.out.println(people.name);
		System.out.println(people.ssn);
		System.out.println();

		System.out.println("이름: "+student.name);
		System.out.println("ssn: "+student.ssn);
	}

}
