import java.util.Scanner;

public class FunKata {
    static Scanner scanner = new Scanner(System.in);

    public static void rideCheck() {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height in cm: ");
        int height = scanner.nextInt();

        if (age >= 12) {
            if (height >= 140) {
                System.out.println("Ride allowed!");
            } else {
                System.out.println("Too short!");
            }
        } else {
            System.out.println("Too young!");
        }
    }




    public static void ageRestriction() {
        int minimumAge = 10;

        System.out.print("How old are you? ");
        int userInput = scanner.nextInt();

        if (userInput >= minimumAge) {
            System.out.println("Welcome to the show!");
        } else {
            System.out.println("Sorry, you're too young");
        }
    }




     public static void countDown() {
        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
        }
    }



     public static void countTo5() {
        int count = 0;
        for (int number = 1; number <= 5; number++) {
            count += 1;
            System.out.println("Number: " + count);
        }
    }




    public static void countingByTwos() {
        for (int number = 2; number <= 10; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }




     public static void countingUp() {
        for (int number = 1; number <= 7; number++) {
            System.out.println(number);
        }
    }




     public static void countVowels() {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();
        int vowelCount = 0;

        for (int index = 0; index < word.length(); index++) {
            char letter = word.charAt(index);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
    }




    public static void divisibleBy3And5() {
        for (int number = 1; number <= 20; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
            }
        }
    }



































    public static void main(String[] args) {
        rideCheck();
        ageRestriction();
        countDown();
        countTo5();
        countingByTwos();
        countingUp();
        countVowels();
        divisibleBy3And5();



    }
}
