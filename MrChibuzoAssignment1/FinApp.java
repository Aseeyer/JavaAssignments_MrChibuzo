import java.util.Scanner;

public class FinApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter Intrest Rate: ");
        double annualInterestRate = input.nextDouble();
        
        double interest = balance * (annualInterestRate/1200);
        System.out.printf("The interest %.5f", interest);

   }
}