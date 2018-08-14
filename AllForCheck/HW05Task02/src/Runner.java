import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {
  public static void main(String[] args) {
	  Random rand = new Random(); 
	  
	  List <User> firstListUsers = new ArrayList<User>();
	  for (int i = 0; i < 5000; i++) {
		firstListUsers.add(new User("a" + rand.nextInt(32), rand.nextInt(50), 1960 + rand.nextInt(50), rand.nextInt(12), rand.nextInt(31)));
	  }
	  for (int i = 0; i < firstListUsers.size(); i++) {
		System.out.print(firstListUsers.get(i).getName() + " ");
	  }
	  System.out.println();
	  List <User> secondListUsers = new ArrayList<User>();
	  for (int i = 0; i < 5000; i++) {
		secondListUsers.add(new User("a" + rand.nextInt(32), rand.nextInt(50), 1960 + rand.nextInt(50), rand.nextInt(12), rand.nextInt(31)));
	  }
	  for (int i = 0; i < 5000; i++) {
		System.out.print(secondListUsers.get(i).getName() + " ");
	  }
	  
	  
	  
//	  Comparator.comparing(User::getName)
//	  			.thenComparing(User::getAge)
//	  			.thenComparing(User::getYear)
//	  			.thenComparing(User::getMonth)
//	  			.thenComparing(User::getDay);
//  System.out.println(firstListUsers);
	  	  List<User> common = new ArrayList<User>(firstListUsers);
	  common.retainAll(secondListUsers);
	  System.out.println(common);
////	List<User> thirdList = firstListUsers.stream().filter(secondListUsers::contains).collect(Collectors.toList());
//	  System.out.println();
//	  	for (int j = 0; j < common.size(); j++) {
//		  System.out.print(common.get(j).getName() + " ");
//	  }
//	  
//	  

  }
}
