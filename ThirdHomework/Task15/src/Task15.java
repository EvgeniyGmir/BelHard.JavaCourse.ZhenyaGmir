import java.util.Scanner;
import java.util.Random;

public class Task15 {
	public static void main(String[] args) {
		Random rand = new Random();
		char letter = (char)('A'+ rand.nextInt(26));
		System.out.println(letter);
		System.out.println("Ok. We will play in intresting game. Guess the letter that the computer conceived. Let's go !!!");
		Scanner scan = new Scanner(System.in);
		char guessLetter = scan.next().charAt(0);
		guessTrying(guessLetter ,letter);
	}
	
	public static void guessTrying(char guessLetter, char letter) {
		int charToIntGuessLetter = Character.getNumericValue(guessLetter);
		int charToIntLetter = Character.getNumericValue(letter);
		while (charToIntGuessLetter != charToIntLetter) {
			if(charToIntGuessLetter > charToIntLetter) {
				System.out.println("You're too high! Try again !!!");
			} else if(charToIntGuessLetter < charToIntLetter) {
					System.out.println("You're too low! Try again !!!");
				}
			Scanner scan = new Scanner(System.in);
			guessLetter = scan.next().charAt(0);
			charToIntGuessLetter = Character.getNumericValue(guessLetter);
			
		}
		System.out.println("Right! You WIN!!!");
	}
}
