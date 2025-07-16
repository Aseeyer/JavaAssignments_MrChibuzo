import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        
        int year = input.nextInt();

       if(year >= 1000){ if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
}
else{
System.out.print("It is invalid");}
    }
}
