package test.Diagram.StudentCourseTranscript;

public class Transcript {
	
	private Student student;
	private Course course;
	private String grade;
	private String date;
	
	public Transcript(Student student, Course course) {
		
		this.student = student;
		this.course = course;
		
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public Student getStudents() {
		
		return student;
	}

	public Course getCourses() {
		return course;
	}
	
	
	
	
	
	
}
