import  java.util.Scanner;


public class RangeNotInArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");

        int numberOfElements = input.nextInt();
        int[] numbers = new int[numberOfElements];

        for (int index = 0; index < numberOfElements; index++) {
            numbers[index] = input.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int indexTwo = 1; indexTwo < numberOfElements; indexTwo++) {
            if (numbers[indexTwo] < min) min = numbers[indexTwo];

            if (numbers[indexTwo] > max) max = numbers[indexTwo];
        }



        System.out.println("Missing numbers in range:");

        for (int indexThree = min; indexThree <= max; indexThree++) {
            boolean found = false;
            for (int innerOne = 0; innerOne < numberOfElements; innerOne++) {
                if (numbers[innerOne] == indexThree) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(indexThree + ",");
            }

        }

    }
}
