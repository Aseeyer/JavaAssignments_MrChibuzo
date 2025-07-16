import java.util.Scanner;

public class Multiples{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int multiple = input.nextInt();

if (multiple % 6 == 0 || multiple % 7 == 0){
    System.out.printf("The number %d is a multiple of 6 or 7", multiple);}
/* else if (multiple % 7 == 0){
    System.out.printf("The number %d is a multiple of 7", multiple);} */
else{
    System.out.printf("%d is not a multiple of 6 nor a multiple of 7", multiple);}
 }
}