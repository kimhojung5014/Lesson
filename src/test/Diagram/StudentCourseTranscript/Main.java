package test.Diagram.StudentCourseTranscript;


public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동");
		Student s2 = new Student("홍길서");
		Student s3 = new Student("홍길남");
		
		Course c1 = new Course("SoftWare Engineering");
		Course c2 = new Course("Design Pattern");
		Course c3 = new Course("Computer Programming");
		
		Transcript t1 = new Transcript(s1,c1);
		t1.setDate("2022년");
		t1.setGrade("A");	
		s1.addTranscript(t1);
		c1.addTranscript(t1);
		
		Transcript t2 = new Transcript(s2, c2);
		t2.setDate("2021년");
		t2.setGrade("B");	
		s2.addTranscript(t2);
		c2.addTranscript(t2);
		
		Transcript t3 = new Transcript(s3, c3);
		t3.setDate("2021년");
		t3.setGrade("C");	
		s3.addTranscript(t3);
		c3.addTranscript(t3);
		
		Transcript[] transcripts = {t1,t2,t3};
		for(Transcript t:transcripts) {
			System.out.println(t.getStudents().getName());
			System.out.println(t.getCourses().getName());
			System.out.println(t.getDate());
			System.out.println(t.getGrade());
		}
	}

}
