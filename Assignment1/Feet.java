import java.util.Scanner;

public class Feet{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Value For Feet: ");
        double feet = input.nextDouble();
        
        double feetToMeter = feet * 0.305;
        System.out.printf("%f feet is %.4f meters", feet, feetToMeter);

  }
}