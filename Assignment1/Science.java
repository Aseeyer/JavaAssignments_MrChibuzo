import java.util.Scanner;

public class Science{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Amount Of Water: ");
        double amountOfWater = input.nextDouble();
        System.out.print("Enter The Initial Tempreture: ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter The Final Tempreture: ");
        double finalTemp = input.nextDouble();
        
        double M = amountOfWater;
        double energyNeeded = M * (finalTemp - initialTemp) * 4184;
        System.out.printf("The energy needed is %.1fj", energyNeeded);

  }
}