import java.util.Scanner;

public class RandomOperatorGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        System.out.print("Enter 1 for +, 2 for -, 3 for * and 4 for /...");
        int operator = input.nextInt();

      do{
        if(operator == 1 ){
            System.out.print(firstNumber + secondNumber); }
        else if(operator == 2 ){
            System.out.print(firstNumber - secondNumber); }
        else if(operator == 3 ){
            System.out.print(firstNumber * secondNumber); }
        else if(operator == 4 ){
            System.out.print(firstNumber / secondNumber); }
        }while(operator > 0 && operator <= 4);
    }

}