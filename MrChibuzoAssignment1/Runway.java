import java.util.Scanner;
import java.lang.Math;

public class Runway{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Speed: ");
        double v = input.nextDouble();
        System.out.print("Enter Acceleration: ");
        double a = input.nextDouble();

        

        double length = Math.pow(v, 2)/(2 *a);
        System.out.printf("The minimum runway length for this airplane is %.3f", length);

  }
}