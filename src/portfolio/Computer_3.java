package portfolio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import static java.lang.System.out;

public class Computer_3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// introduce player
		out.println("Welcome to the number guessing game!\n"
				+ "However, you won't be the one guessing this time.\n\n"
				+ "Enter a number between 1 and 100 for the computer to guess:");
		
		// get user's number
		int num = input.nextInt();
		
		// make sure the number is between 1 and 100
		while (num < 1 || num > 100 ) {
			out.println("\nI said a number between 1 and 100!");
			num = input.nextInt();
		}
		
		out.println();
		
		// initialize variables
		int high = 100;
		int low = 1;
		int guess = ThreadLocalRandom.current().nextInt(low, high);		// computer's guess
		
		// while the computer hasn't guessed the correct number
		do {
			
			// if the guess was too high
			if (guess > num) {
				high = guess;
				guess = ThreadLocalRandom.current().nextInt(low, high);		// computer's new guess
				out.println(high + " is too high.");
			
			// if the guess was too low
			} else if (guess < num) {
				low = guess;
				guess = ThreadLocalRandom.current().nextInt(low, high);		// computer's new guess
				out.println(low + " is too low.");
				
			}
		} while (guess != num);
		
		out.println("The computer guessed your number!\n\n\n");
		
		for (int count = 0; count < 100; count ++) {
			out.println("You lose, computer wins!\n");
		}

	}

}
