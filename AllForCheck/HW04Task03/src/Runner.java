
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student[] studentArray = {student1,student2,student3,student4,student5};
		List studentsList = new ArrayList<>();
	
		studentArray[0].setName("Vasya");
		studentArray[1].setName("Kolya");
		studentArray[2].setName("Ira");
		studentArray[3].setName("Roman");
		studentArray[4].setName("Zhenya");
		
		studentArray[0].setCourse(1);
		studentArray[1].setCourse(2);
		studentArray[2].setCourse(3);
		studentArray[3].setCourse(2);
		studentArray[4].setCourse(2);
		for(int i = 0; i < studentArray.length; i ++) {
		studentsList.add(studentArray[i]);
		}

		int j = 0;
		Iterator<String> iter = studentsList.iterator(); 
		System.out.println("Students list: ");
		while (iter.hasNext()) {
			studentArray[j].printStudents(studentsList, 2);
			j++;
			if(j == 5) break;
		}
		

//		for (int i= 0 ; i < studentsList.size(); i++) {
//			studentArray[i].printStudents(studentsList, 2);
//		}
//
//		
	}
}
