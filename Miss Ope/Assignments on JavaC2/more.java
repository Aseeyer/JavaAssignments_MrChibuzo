import java.util.Scanner;

public class more{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = input.nextInt();
int square = number * number;
System.out.printf("Number %d is ", number);
if (number > 100){
System.out.printf("Number is greater than 100.%n", number);
}
if (number == 100){
System.out.printf("Number is equal to 100.%n" number);
}
if (number != 100){
System.out.printf("Number is not equal to 100.%n", number);
}
if (number == 100){
System.out.printf("Number is equal to 100.%n", number);
}
if (number < 100){
System.out.printf("Number is less to 100.%n", number);
}

if (square > 100) {
System.out.printf("Square %d is greater than 100.%n", square);
}
if (square < 100) {
System.out.printf("Square %d is less than 100.%n", square);
}
if (square == 100) {
System.out.printf("Square %d is equal to 100.%n", square);
}
if (square != 100) {
System.out.println("Square is not equal to 100.");
}
}}