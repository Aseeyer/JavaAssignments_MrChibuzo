import java.util.Scanner;

public class NumOfYears{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Minutes: ");
        double minutes = input.nextDouble();

        double days = minutes / (60 * 24);
        double year = days/365;
        double remainingDays = (days % 365);

        System.out.printf("%.0f minutes is approximately %f years and %f days", minutes, year, remainingDays);
}}