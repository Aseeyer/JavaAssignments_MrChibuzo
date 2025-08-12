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










































    public static void main(String[] args) {
        rideCheck();
        ageRestriction();
        countDown();

    }
}
