import java.util.Random;
import java.util.Scanner;

public class Task10 {
	public static void main (String[] args) {
		int a=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of marks: ");
		int number = scan.nextInt();
		int [] mas = new int[number];
		Random rand = new Random();
		for (int i = 0; i < number; i++) {
			mas[i] = rand.nextInt(10);
		}
		System.out.print("The array of marks: ");
		for (int i = 0; i < number; i++) {
			System.out.print( mas[i] + " ");
		}
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			max = Math.max(max, mas[i]);
		}
		System.out.println("\nThe max mark in array is " + max);
		int maxIndex = 0;
		int a1 = mas[0];
		for (int i = 0; i < mas.length; i++) {
			int a2 = mas[i];
			if (a1 < a2) {
				a1 = a2;
				maxIndex = i;
			}
		}
		System.out.println("The index of the max mark is " + maxIndex);
		System.out.println("First mark in array is " + mas[0]);
		System.out.println("Last mark in array is " + mas[mas.length-1]);
	}
}
