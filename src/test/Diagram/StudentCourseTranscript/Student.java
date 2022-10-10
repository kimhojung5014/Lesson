package test.Diagram.StudentCourseTranscript;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private ArrayList<Transcript>transcripts;
	private ArrayList<Course> courses;
	
	public Student(String name) {
		this.name = name;
		transcripts = new ArrayList<Transcript>();
		courses = new ArrayList<Course>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
		courses.add(transcript.getCourses());
	
	}
	
	public ArrayList<Course> getcourses() {
		return courses;
	}
	
	public String getName() {
		return name;
	}
}
