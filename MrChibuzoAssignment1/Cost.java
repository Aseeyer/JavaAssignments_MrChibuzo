import java.util.Scanner;

public class Cost{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Driving Distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter Miles Per Gallon: ");
        double miles = input.nextDouble();
        System.out.print("Enter Price Per Gallon: ");
        double price = input.nextDouble();
        
        double costOfTrip = (distance / miles) * price;
        System.out.printf("The cost of driving is $%.2f", costOfTrip);
  }
}