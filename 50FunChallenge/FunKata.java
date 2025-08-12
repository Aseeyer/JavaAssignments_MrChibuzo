import java.util.Scanner;

public class FunKata {
    static Scanner scanner = new Scanner(System.in);

    public static void greetingChooser() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (name.equals("Alex")) {
            System.out.println("Hello, friend!");
        } else {
            System.out.println("Hi, stranger!");
        }
    }

    public static void petChooser() {
        System.out.print("Enter a pet: ");
        String pet = scanner.nextLine();
        if (pet.equalsIgnoreCase("dog")) {
            System.out.println("Woof! Dogs are awesome!");
        } else {
            System.out.println("Cool choice, but I love dogs!");
        }
    }

    public static void favoriteNumber() {
        final int favoriteNumber = 7;
        System.out.print("Guess a number: ");
        int guess = scanner.nextInt();
        scanner.nextLine();
        if (guess == favoriteNumber) {
            System.out.println("That's my favorite number!");
        } else {
            System.out.println("Nice try, guess again!");
        }
    }

    public static void countingTo5() {
        for (int count = 1; count <= 5; count++) {
            System.out.println("Number: " + count);
        }
    }

    public static void evenOrOdd() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number % 2 == 0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }
    }

    public static void multiplesOf3() {
        for (int value = 3; value <= 15; value += 3) {
            System.out.println(value);
        }
    }

    public static void passwordChecker() {
        final String password = "secret123";
        System.out.print("Enter password: ");
        String attempt = scanner.nextLine();
        if (attempt.equals(password)) {
            System.out.println("Access granted! Welcome!");
        } else {
            System.out.println("Access denied!");
        }
    }

    public static void countingDown() {
        for (int timer = 10; timer >= 1; timer--) {
            System.out.println(timer);
        }
    }

    public static void trafficLight() {
        System.out.print("Enter a color: ");
        String color = scanner.nextLine();
        if (color.equalsIgnoreCase("green")) {
            System.out.println("Go!");
        } else if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop!");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("Wait!");
        } else {
            System.out.println("Unknown color");
        }
    }

    public static void squareNumbers() {
        for (int n = 1; n <= 5; n++) {
            System.out.println(n + " squared is " + (n * n));
        }
    }

    public static void positiveOrNegative() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number > 0) {
            System.out.println("Positive!");
        } else {
            System.out.println("Negative or zero!");
        }
    }

    public static void loopingStars() {
        for (int line = 1; line <= 5; line++) {
            System.out.println("*");
        }
    }

    public static void ageRestriction() {
        final int minimumAge = 10;
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age >= minimumAge) {
            System.out.println("Welcome to the show!");
        } else {
            System.out.println("Sorry, you're too young!");
        }
    }

    public static void sumOfNumbers() {
        int total = 0;
        for (int n = 1; n <= 10; n++) {
            total += n;
        }
        System.out.println("The sum is " + total);
    }

    public static void guessTheAnimal() {
        final String myAnimal = "dog";
        System.out.print("Guess the animal: ");
        String user = scanner.nextLine();
        if (user.equals(myAnimal)) {
            System.out.println("Correct! It's a dog!");
        } else {
            System.out.println("Nope, it's a dog!");
        }
    }

    public static void countingByTwos() {
        for (int even = 2; even <= 10; even += 2) {
            System.out.println(even);
        }
    }

    public static void temperatureCheck() {
        System.out.print("Enter the temperature: ");
        int temp = scanner.nextInt();
        scanner.nextLine();
        if (temp > 30) {
            System.out.println("Hot!");
        } else if (temp >= 15) {
            System.out.println("Nice!");
        } else {
            System.out.println("Cold!");
        }
    }

    public static void printYourName() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        for (int repeat = 0; repeat < 3; repeat++) {
            System.out.println(name + "!");
        }
    }

    public static void magicNumber() {
        final int magicNumber = 42;
        System.out.print("Enter a number: ");
        int guess = scanner.nextInt();
        scanner.nextLine();
        if (guess == magicNumber) {
            System.out.println("You found the magic number!");
        } else {
            System.out.println("Keep looking!");
        }
    }

    public static void countingUp() {
        for (int step = 1; step <= 7; step++) {
            System.out.println(step);
        }
    }

    public static void numberGuessingGame() {
        final int secret = 8;
        while (true) {
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();
            scanner.nextLine();
            if (guess == secret) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }

    public static void multiplicationTable() {
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println("5 x " + multiplier + " = " + (5 * multiplier));
        }
    }

    public static void gradeCalculator() {
        System.out.print("Give me your test score (0-100): ");
        int score = scanner.nextInt();
        scanner.nextLine();
        if (score >= 90) {
            System.out.println("A!");
        } else if (score >= 80) {
            System.out.println("B!");
        } else if (score >= 70) {
            System.out.println("C!");
        } else {
            System.out.println("F!");
        }
    }

    public static void nestedEvenChecker() {
        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void passwordRetry() {
        final String correctPassword = "python";
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter password: ");
            String tryPass = scanner.nextLine();
            if (tryPass.equals(correctPassword)) {
                System.out.println("Success!");
                return;
            } else {
                System.out.println("Try again!");
            }
        }
        System.out.println("Locked out!");
    }

    public static void starTriangle() {
        for (int line = 1; line <= 5; line++) {
            for (int starCount = 1; starCount <= line; starCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void divisibleBy3And5() {
        for (int n = 1; n <= 20; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n);
            }
        }
    }

    public static void simpleCalculator() {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter + or -: ");
        String op = scanner.nextLine();
        if (op.equals("+")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op.equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else {
            System.out.println("Unknown operation");
        }
    }

    public static void countVowels() {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();
        int vowelCount = 0;
        for (int idx = 0; idx < word.length(); idx++) {
            char ch = word.charAt(idx);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
    }

    public static void nestedLoopSquare() {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ageAndHeightCheck() {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height in cm: ");
        int height = scanner.nextInt();
        scanner.nextLine();
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

    public static void sumOfEvens() {
        int total = 0;
        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0) total += n;
        }
        System.out.println("Sum of evens: " + total);
    }

    public static void guessWithHints() {
        final int answer = 25;
        while (true) {
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();
            scanner.nextLine();
            if (guess > answer) {
                System.out.println("Too high!");
            } else if (guess < answer) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct!");
                break;
            }
        }
    }

    public static void numberPattern() {
        for (int line = 1; line <= 3; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void ticketPrice() {
        final int adultPrice = 10;
        final int childPrice = 5;
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age >= 18) {
            System.out.println("Ticket price: $" + adultPrice);
        } else {
            System.out.println("Ticket price: $" + childPrice);
        }
    }

    public static void factorCounter() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int factorCount = 0;
        for (int possible = 1; possible <= number; possible++) {
            if (number % possible == 0) factorCount++;
        }
        System.out.println("Factors: " + factorCount);
    }

    public static void nestedColorChooser() {
        System.out.print("Enter a color: ");
        String color = scanner.nextLine();
        if (color.equalsIgnoreCase("red")) {
            for (int repeat = 0; repeat < 3; repeat++) {
                System.out.println("Red is awesome!");
            }
        } else {
            System.out.println("I like red better!");
        }
    }

    public static void multiplesInRange() {
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        scanner.nextLine();
        for (int n = start; n <= end; n++) {
            if (n % 4 == 0) System.out.println(n);
        }
    }

    public static void simpleQuiz() {
        final String answer = "Paris";
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("What's the capital of France? ");
            String guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(answer)) {
                System.out.println("Correct!");
                return;
            } else {
                System.out.println("Try again!");
            }
        }
    }

    public static void reverseCounting() {
        for (int n = 20; n >= 10; n--) {
            if (n == 15) System.out.println("Halfway!");
            System.out.println(n);
        }
    }

    public static void nestedNumberChecker() {
        for (int n = 1; n <= 15; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz!");
            } else if (n % 3 == 0) {
                System.out.println("Fizz!");
            } else if (n % 5 == 0) {
                System.out.println("Buzz!");
            } else {
                System.out.println(n);
            }
        }
    }

    public static void pinEntrySystem() {
        final String pin = "1234";
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter PIN: ");
            String input = scanner.nextLine();
            if (input.equals(pin)) {
                System.out.println("Access granted!");
                return;
            } else {
                System.out.println("Try again!");
            }
        }
        System.out.println("Locked!");
    }

    public static void starDiamond() {
        System.out.println("*");
        System.out.println("***");
        System.out.println("*****");
        System.out.println("***");
        System.out.println("*");
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
        scanner.nextLine();
        double average = total / 5.0;
        System.out.println("Average: " + average);
    }

    public static void nestedLoopGrid() {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void primeNumberCheck() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        boolean isPrime = true;
        if (number <= 1) isPrime = false;
        for (int candidate = 2; candidate < number; candidate++) {
            if (number % candidate == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime!"); else System.out.println("Not prime!");
    }

    public static void temperatureConverter() {
        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();
        scanner.nextLine();
        if (temp < -273) {
            System.out.println("Impossible!");
            return;
        }
        for (int offset = 0; offset < 5; offset++) {
            int current = temp + offset;
            double f = (current * 9.0 / 5) + 32;
            System.out.println(current + "C = " + f + "F");
        }
    }

    public static void nestedColorGame() {
        final String favoriteColor = "blue";
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Guess the color: ");
            String guess = scanner.nextLine();
            if (guess.equalsIgnoreCase(favoriteColor)) {
                System.out.println("Correct!");
                return;
            } else if (guess.equalsIgnoreCase("green")) {
                System.out.println("Close!");
            } else {
                System.out.println("Wrong!");
            }
        }
    }

    public static void sumOfMultiples() {
        int total = 0;
        for (int n = 1; n <= 50; n++) {
            if (n % 3 == 0 || n % 5 == 0) total += n;
        }
        System.out.println("Sum: " + total);
    }

    public static void numberPyramid() {
        for (int line = 1; line <= 4; line++) {
            for (int count = 1; count <= line; count++) {
                System.out.print(line + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        greetingChooser();
        petChooser();
        favoriteNumber();
        countingTo5();
        evenOrOdd();
        multiplesOf3();
        passwordChecker();
        countingDown();
        trafficLight();
        squareNumbers();
        positiveOrNegative();
        loopingStars();
        ageRestriction();
        sumOfNumbers();
        guessTheAnimal();
        countingByTwos();
        temperatureCheck();
        printYourName();
        magicNumber();
        countingUp();
        numberGuessingGame();
        multiplicationTable();
        gradeCalculator();
        nestedEvenChecker();
        passwordRetry();
        starTriangle();
        divisibleBy3And5();
        simpleCalculator();
        countVowels();
        nestedLoopSquare();
        ageAndHeightCheck();
        sumOfEvens();
        guessWithHints();
        numberPattern();
        ticketPrice();
        factorCounter();
        nestedColorChooser();
        multiplesInRange();
        simpleQuiz();
        reverseCounting();
        nestedNumberChecker();
        pinEntrySystem();
        starDiamond();
        gradeAverage();
        nestedLoopGrid();
        primeNumberCheck();
        temperatureConverter();
        nestedColorGame();
        sumOfMultiples();
        numberPyramid();
    }
}
