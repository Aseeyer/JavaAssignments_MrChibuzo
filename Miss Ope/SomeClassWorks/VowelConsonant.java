import java.util.Scanner;

public class VowelConsonant{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        String userInput = input.next().toLowerCase();
        char alphabet = input.next().charAt(0);

if (Character.isLetter(alphabet){
    
    alphabet == 'a' || alphabet == 'A' || 
    alphabet == 'e' || alphabet == 'E' || 
    alphabet == 'i' || alphabet == 'I' || 
    alphabet == 'o' || alphabet == 'O' || 
    alphabet == 'u' || alphabet == 'U'){
    System.out.print("It is a vowel");}

else {
    System.out.print("It is a consonant");
}

 }
}
