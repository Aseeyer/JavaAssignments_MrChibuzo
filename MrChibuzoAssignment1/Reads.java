import java.util.Scanner;

public class Reads{
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter integers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
    
        int evenSum = 0;
        int oddSum = 0;
       
    if (num1 % 2 == 0) evenSum = evenSum + num1;
    if (num1 % 2 == 1) oddSum = oddSum + num1;

    if (num2 % 2 == 0) evenSum = evenSum + num2;
    if (num2 % 2 == 1) oddSum = oddSum + num2;

    if (num3 % 2 == 0) evenSum = evenSum + num3;
    if (num3 % 2 == 1) oddSum = oddSum + num3;

    if (num4 % 2 == 0) evenSum = evenSum + num4;
    if (num4 % 2 == 1) oddSum = oddSum + num4;

    if (num5 % 2 == 0) evenSum = evenSum + num5;
    if (num5 % 2 == 1) oddSum = oddSum + num5;

    System.out.printf("Sum of even numbers is %d%n", evenSum);
    System.out.printf("Sum of odd numbers is %d%n", oddSum);

    

}
}