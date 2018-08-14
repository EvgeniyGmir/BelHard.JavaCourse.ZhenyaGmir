import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Runner {


	public static void printSet( List listSet) {
		System.out.println(listSet);
	}
	
	public static List<Set> union( Set set1, Set set2) {
		List <Set> listSet = new ArrayList<>(); 
		listSet.addAll(set1);
		listSet.addAll(set2);
		return listSet;
		
	}
	
	public static List intersect(Set set1, Set set2) {
		List <Set> listSet = new ArrayList<>(); 
		set1.retainAll(set2);	
		listSet.addAll(set1);
		return listSet;
	}
	
	
	public static void main(String[] args) {
		Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1,2,3,5,7,8));
		Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1,6,9,14,3,7));
		printSet(union(set1 ,set2));
		printSet(intersect(set1, set2));
		
	}
}
