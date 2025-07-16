import java.util.Scanner;


public class third {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter First Integer: ");
	int number1 = input.nextInt();
	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
        int toSquare1 = number1 * number1;
        int toSquare2 = number2 * number2;
        int sum = toSquare1 + toSquare2;
        int difference = toSquare1 - toSquare2;

        System.out.printf("square of %d is %d%n", number1, toSquare1);
        System.out.printf("Square of %d is %d%n", number2, toSquare2);
        System.out.printf("Sum up of squares is %d%n", sum);
        System.out.printf("Difference of both squares is %d%n", difference);
	}
}