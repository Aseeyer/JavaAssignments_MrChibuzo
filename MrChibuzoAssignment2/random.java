import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; 
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Correct! The number was " + randomNumber);
            }
        }
    }
}
