import java.util.Scanner;

public class Task14 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter something: ");
		String str = scan.nextLine();
		sumNumbersAndBuilding(str);
		scan.close();
	}
	
	public static void sumNumbersAndBuilding( String str) {
		int sum = 0, charToInt;
		StringBuilder builder = new StringBuilder();
		char [] toArray = str.toCharArray();
		for (int i = 0; i < toArray.length; i++) {
			if (Character.isDigit(toArray[i])) {
				charToInt = Character.getNumericValue(toArray[i]);
				sum += charToInt;
			}
			if (Character.isLetter(toArray[i])){
				builder.append(toArray[i]);
			}
		}
		System.out.println("Sum numbers in string is " + sum + ".");
		System.out.println("Block of letters: " + builder.toString() +".");
	}
}