package test.Diagram.Student_Course;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Student>students;
	
	public Course(String name) {
		this.name = name;
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		if(students.contains(student)) {
			students.remove(student);
		}
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public String getName() {
		return name;
	}

}
