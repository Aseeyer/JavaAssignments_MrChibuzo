import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("0 for heads, 1 for tails");
        int randNumber = rand.nextInt(2);

        System.out.println("Guess if it is Heads or Tails (0 or 1): ");
        int guess = input.nextInt();

        if (guess == randNumber) {
            System.out.println("Correct Guess");
        } else {
            System.out.println("Incorrect Guess");
        }
    }
}   