import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int largest = Integer.MIN_VALUE;  
        int smallest = Integer.MAX_VALUE;  

        String choice;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
    }
}
