import java.util.Scanner;

public class IntValues{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Interger: ");
        int a = input.nextInt();
        System.out.print("Enter Second Interger: ");
        int b = input.nextInt();
   
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapping Values Of a to b and b to a");
        System.out.println("a = " +a);
        System.out.println("b = " +b);


  }
}