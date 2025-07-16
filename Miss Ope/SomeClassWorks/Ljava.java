import java.util.Scanner;

/* public class Ljava{
	public static void main(String[] args){
	System.out.println("Welcome New Programmer");
	}
}

public class Ljava{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first name:" );
	String name = input.next();
	System.out.println("Hello Mr " + name);
	}
}

public class Ljava{
	public static void main(String[] args){
	System.out.printf("%s%n%s%n","Welcome to ", "Welcome to ", "Welcome to ");
	System.out.println("Java Programming\nToday");
	}
}*/

/* public class Ljava {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter First Integer: ");
	int number1 = input.nextInt();
	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	int sum = number1 + number2;
	System.out.printf("Sum is %d%n", sum);
	}
}*/

/* public class Ljava{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter first interger: ");
int number1 = input.nextInt();
System.out.print("Enter Second Interger: ");
int number2 = input.nextInt();
if (number1 == number2){
System.out.printf("%d == %d%n", number1, number2);
}
if (number1 != number2){
System.out.printf("%d != %d%n", number1, number2);
}
if (number1 < number2){
System.out.printf("%d < %d%n", number1, number2);
}
if (number1 > number2){
System.out.printf("%d > %d%n", number1, number2);
}
if (number1 <= number2){
System.out.printf("%d <= %d%n", number1, number2);
}
if (number1 >= number2){
System.out.printf("%d >= %d%n", number1, number2);
}

}} */

public class Ljava{
    public static void main(String[] args) {
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 7 % 10);

    Scanner input = new Scanner(System.in);
    
    System.out.print("What is " + number1 + " + " + number2 + " ? ");
    
    int answer = input.nextInt();
 
    System.out.println(
        number1 + " + " + number2 + " = " + answer + " is " +      
        (number1 + number2 == answer));
    
}
    }
































