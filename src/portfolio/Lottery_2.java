package portfolio;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Lottery_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		// generate lottery number
		int lottery = rand.nextInt(99) + 1;
		out.println("Enter your lottery number pick (2 digits): ");
		int guess = input.nextInt();
		
		out.println(lottery);
		
		// get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		// get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		out.println("The lottery number is " + lottery + ".");
		
		if (guess == lottery) {
			out.println("Exact match: you win $10,000.");
			
		} else if (guessDigit2 == lotteryDigit1 
				&& guessDigit1 == lotteryDigit2) {
			
			out.println("Match all digits: you win $3,000.");
			
		} else if (guessDigit1 == lotteryDigit1 
				|| guessDigit1 == lotteryDigit2 
				|| guessDigit2 == lotteryDigit1 
				|| guessDigit2 == lotteryDigit2) {
			
			out.println("Match one digit: you win $1,000.");
			
		} else {
			out.println("Sorry no match.");
		}

	}

}
