import java.util.Scanner;

public class Physics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Starting Velocity: ");
        double Vo = input.nextDouble();

        System.out.print("Enter Ending Velocity: ");
        double V1 = input.nextDouble();

        System.out.print("Enter Time: ");
        double t = input.nextDouble();
        
        double averageAcceleration = (V1 - Vo)/t;

        System.out.printf("The Starting velocity: %fm/s, Ending Velocity %fm/s, Time %.2fs%n", Vo, V1, t);
        System.out.printf("The average acceleration is %fm/s/s%n", averageAcceleration);
    
  }
}