import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {
	private String name;
	private int age;
	private int year;
	private int month;
	private int day;

	public User(String name, int age, int year, int month, int day) {
		this.name = name;
		this.age = age;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
	public String getName() {
		return name;
	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
	public int getAge() {
		return age;
	}
	
//	
//	public void setBirthDay(Calendar birthDay) {
//		this.birthDay = birthDay;
//	}
//	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
}
