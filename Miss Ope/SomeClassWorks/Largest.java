import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();

        System.out.print("What is your name? ");
        String name1 = input.next();
        System.out.printf("My name is %s%n", name1);
        int largest = number1;
        long secondLargest = -214748364888L;
        long thirdLargest = -214748364888L;


        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        
        if (number1 < largest && number1 > secondLargest) secondLargest = number1;
        if (number2 < largest && number2 > secondLargest) secondLargest = number2;
        if (number3 < largest && number3 > secondLargest) secondLargest = number3;        


        if (number1 < largest && number1 < secondLargest) thirdLargest = number1;
        if (number2 < largest && number2 < secondLargest) thirdLargest = number2;
        if (number3 < largest && number3 < secondLargest) thirdLargest = number3;   
        

        System.out.printf("Largest number is %d%n", largest);
        System.out.printf("Second Largest number is %d%n", secondLargest);
        System.out.printf("Third Largest number is %d%n", thirdLargest);

System.out.printf("My name is " + name1 + " and my largest number is %d", largest );

System.out.printf("The Largest number is %d, the Second largest is %d, and the third largest is %d%n", largest, secondLargest, thirdLargest);

 }
}