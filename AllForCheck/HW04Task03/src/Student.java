import java.util.Arrays;
import java.util.List;

public class Student{
	private String name;
	private Integer course;
	private List students;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCourse(Integer course) {
		this.course = course;
	}
	
	public Integer getCourse() {
		return course;
	}
	
	public void printStudents(List students, Integer course) {
		if(this.course == course) {
			System.out.println("" + getName() + ", of " + course + " course.");
			}
	}
}
