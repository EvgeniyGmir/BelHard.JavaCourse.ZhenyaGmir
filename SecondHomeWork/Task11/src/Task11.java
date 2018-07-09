import java.util.Random;
import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int number = scan.nextInt();
		int [] mas = new int[number];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
		System.out.print("The elementary array: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print( mas[i] + " ");
		}
		System.out.print("\nThe final array: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[(number-1) - i] + " ");
		}
	}
}
