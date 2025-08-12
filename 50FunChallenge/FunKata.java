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




     public static void isEvenOdd() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }
    }





     public static void factorCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factorCount = 0;

        for (int possibleFactor = 1; possibleFactor <= number; possibleFactor++) {
            if (number % possibleFactor == 0) {
                factorCount++;
            }
        }

        System.out.println("Factors: " + factorCount);
    }




    public static void favoriteNumberGame() {
        final int favoriteNumber = 7;
        System.out.print("Guess my favorite number: ");
        int guess = scanner.nextInt();

        if (guess == favoriteNumber) {
            System.out.println("That's my favorite number!");
        } else {
            System.out.println("Nice try, guess again!");
        }
    }




    public static void gradeAverage() {
        int total = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Enter score " + (count + 1) + " (0-100): ");
            int score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                total += score;
                count++;
            } else {
                System.out.println("Invalid score! Try again.");
            }
        }

        double average = total / 5.0;
        System.out.println("Average: " + average);
    }




    public static void gradeCalculator() {
        System.out.print("Give me your test score (0-100): ");
        int userInput = scanner.nextInt();

        if (userInput >= 90) {
            System.out.println("A!");
        } else if (userInput >= 80 && userInput <= 89) {
            System.out.println("B!");
        } else if (userInput >= 70 && userInput <= 79) {
            System.out.println("C!");
        } else if (userInput < 70) {
            System.out.println("F!");
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
        isEvenOdd();
        factorCounter();
        favoriteNumberGame();
        gradeAverage();
        gradeCalculator();








    }
}
