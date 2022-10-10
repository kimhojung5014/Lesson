package test.Diagram.Student_Course;

import java.util.ArrayList;

	public class Student {
	private String name;
	private ArrayList<Course>courses;


	public Student(String name) {
		this.name = name;
		courses = new ArrayList<Course>();
	}


	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	public void dropCource(Course course) {
		if(courses.contains(course)){
			courses.remove(course);
		}
	}

	public ArrayList<Course> getCourse(){
		return courses;
	}
	
	
	


	


	
	
}
