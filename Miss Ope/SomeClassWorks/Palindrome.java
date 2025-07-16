import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three or four digit number: ");
        int number = input.nextInt();

        if (number >= 100 && number <= 9999) {
            if (number >= 1000) {
                int firstDigit = number / 1000;
                int secondDigit = (number % 1000) / 100;
                int thirdDigit = (number % 100) / 10;
                int lastDigit = number % 10;

                if (firstDigit == lastDigit && secondDigit == thirdDigit) {
                    System.out.println(number + " is a palindrome.");
                } else {
                    System.out.println(number + " is not a palindrome.");
                }
            } else {
                int firstDigit = number / 100;
                int lastDigit = number % 10;

                if (firstDigit == lastDigit) {
                    System.out.println(number + " is a palindrome.");
                } else {
                    System.out.println(number + " is not a palindrome.");
                }
            }
        } else {
            System.out.println("Number is invalid. Please enter a 3 or 4 digit number.");
        }
    }
}
