import java.util.Scanner;
import java.lang.Math;

public class Quadratic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // From the quadratic equation standard form
        System.out.print("Enter the coefficient of X squared: ");
        double a = input.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        double b = input.nextDouble();
        System.out.print("Enter the constant: ");
        double c = input.nextDouble();

        double discriminant = (b * b) - 4 * a * c;

        //To solve for X, when it is positive
    if (discriminant > 0){
        double positiveRoot = (-b + Math.sqrt(discriminant)) / (2 * a);

        //To solve for X, when it is negative
        double negativeRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.printf("The valve of X when positive is %.2f and the value of X when it is negative is %.2f%n",
        positiveRoot, negativeRoot);
    }  

    else if (discriminant == 0){
        double oneRealRoot = -b / (2 * a);
        System.out.printf("One real repeated root: X = %.2f%n", oneRealRoot);
    }

    else {
        System.out.println("There is no real roots, because discriminant is < 0.");
}
   }
}