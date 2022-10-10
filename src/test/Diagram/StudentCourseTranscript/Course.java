package test.Diagram.StudentCourseTranscript;

import java.util.ArrayList;

public class Course {
	
	private String name;
	private ArrayList<Transcript>transcripts;
	private ArrayList<Student>students;
	
	public Course(String name) {
		this.name = name;
		transcripts = new ArrayList<Transcript>();
		students = new ArrayList<Student>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
		students.add(transcript.getStudents());
	}

	public String getName() {
		return name;
	}
}
