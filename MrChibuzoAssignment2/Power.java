import java.util.Scanner;

public class Power{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

    System.out.print("Enter Digit1: ");
    int digit1 = input.nextInt();

    System.out.print("Enter Digit2: ");
    int digitPower = input.nextInt();

    int power = 1;
    
for(int i = 1; i <= digitPower; i++) {
            power *= digit1;}
System.out.println(digit1 + " raised to the power of " + digitPower + " is: " + power);


        }




    }