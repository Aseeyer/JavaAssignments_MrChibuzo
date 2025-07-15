import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String select;

        do {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to perform the operation again? (yes/no): ");
            select = input.next();

        } while (select.equalsIgnoreCase("yes"));

        System.out.println("Program terminated.");
    }
}
