import java.util.Scanner;

public class Biggest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        System.out.print("Enter fourth integer: ");
        int num4 = input.nextInt();

        System.out.print("Enter fifth integer: ");
        int num5 = input.nextInt();

        int largest = num1;
        long secondLargest = -214748364888L;

        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        if (num4 > largest) largest = num4;
        if (num5 > largest) largest = num5;

        

        if (num1 < largest && num1 > secondLargest) secondLargest = num1;
        if (num2 < largest && num2 > secondLargest) secondLargest = num2;
        if (num3 < largest && num3 > secondLargest) secondLargest = num3;
        if (num4 < largest && num4 > secondLargest) secondLargest = num4;
        if (num5 < largest && num5 > secondLargest) secondLargest = num5;
        


        System.out.printf("Largest number is %d%n", largest);
        System.out.printf("Second Largest number is %d%n", secondLargest);
 }
}