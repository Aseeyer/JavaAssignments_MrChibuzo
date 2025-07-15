import java.util.Scanner;

public class Health{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Weight In Pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter A Height In Inches: ");
        double height = input.nextDouble();
        
        double weightInKg = weight * 0.45359273;
        double heightInInches = height * 0.0254;
        double BMI = weightInKg/Math.pow(heightInInches, 2);
        System.out.printf("BMI is %.4f", BMI);


 }
}