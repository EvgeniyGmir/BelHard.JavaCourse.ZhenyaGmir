import java.util.Scanner;

public class Task08 {
	public static void main (String[] args) {
		boolean result = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number = scan.nextInt();
		for (int i = 2; i < number; i++) {
			if(number%i == 0) {
				result = true; 
				break;
			}
		}
		if (result) System.out.println("The number "+ number + " isn't simple!");
		else System.out.println("The number " + number + " is simple!");
	}
}