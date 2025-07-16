import java.util.Scanner;
import java.lang.Math;

public class AppFin{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Investment Amount: ");
        double investAmount = input.nextDouble();
        System.out.print("Enter Annual Interest Rate In Percentage: ");
        double annualInterest = input.nextDouble();
        System.out.print("Enter Number Of Years: ");
        double numberOfYears = input.nextDouble();
        
        double monthlyInterestRate = annualInterest / 12 / 100;
        double futureInvestmentValue = investAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.printf("Accumulated value is %.2f", futureInvestmentValue);

  }
}