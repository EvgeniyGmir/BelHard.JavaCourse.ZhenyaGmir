import java.util.Scanner;

public class Task07 {
	public static void main (String[] args) {
		long number, factorial = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number from 10 to 15: " );
		number = scan.nextInt();
		if (number < 10 || number >15) {System.out.println("Your number is out of range!");}
		else {for(int i = 1; i <number + 1; i++) {
			factorial *= i;
		}
		System.out.println("Factorial " + number + " is " + factorial);}
	}

}
