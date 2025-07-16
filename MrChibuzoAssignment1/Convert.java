import java.util.Scanner;

public class Convert{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pound = input.nextDouble();
        
        double result = pound * 0.454;
        System.out.printf("%.1f pounds is %.3f kilograms", pound, result);

  }
}