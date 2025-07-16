import java.util.Scanner;


public class Divisible{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter First Inter: ");
int num1 = input.nextInt();

if (num1 % 3 == 0){
System.out.println("It is divisible by 3");
}
if (num1 % 3 != 0) {
System.out.println("It was not divisible by 3"); }
}}