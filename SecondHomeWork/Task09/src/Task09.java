import java.util.Scanner;

public class Task09 {
	public static void main (String[] args) {
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of primes: ");
		int number = scan.nextInt();
		for (int i = 0; i <= number; i++) {
			result += 3*i;
		}
		System.out.println("Sum of the first " + number + " numbers divisible by 3 without a remainder is " + result);
	}
}

