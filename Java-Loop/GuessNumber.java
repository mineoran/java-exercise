//The problem is to guess what number a computer has in mind. 
//You will write a program that  randomly generates an integer between 0 and 100, inclusive. 
//The program prompts the user  to enter a number continuously until the number matches the randomly generated number. 
//For  each user input, the program tells the user whether the input is too low or too high, so the user  can make the next guess intelligently.
//The magic number is between 0 and 100. To minimize the number of guesses, enter 50 first.If your guess is too high, the magic number is between 0 and 49.
//If your guess is too low,the magic number is between 51 and 100. 
//Thus, you can eliminate half of the numbers from  further consideration after one guess.
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		
		int guess = -1;
		while (guess != number) {
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low"); 
		}

	}

}
