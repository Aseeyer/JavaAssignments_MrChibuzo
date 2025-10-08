import java.util.Scanner;

public class sumArray {

    public static int[] searchForMatch(int[] numbers, int targetSum) {

        for (int firstIndex = 0; firstIndex < numbers.length; firstIndex++) {

            for (int secondIndex = firstIndex + 1; secondIndex < numbers.length; secondIndex++) {

                int firstNumber = numbers[firstIndex];
                int secondNumber = numbers[secondIndex];

                if (firstNumber + secondNumber == targetSum) {
                    return new int[]{firstNumber, secondNumber};
                }
            }
        }

        return new int[]{};
    }








    public static void main(String[] args) {

        int[] numbers = {5, 2, 4, 5};
        int targetSum = 9;

        int[] pair = searchForMatch(numbers, targetSum);

        if (pair.length == 2) {
            System.out.println("Pair found: [" + pair[0] + ", " + pair[1] + "]");
        } else {
            System.out.println("No pair found for target " + targetSum + ".");
        }
    }
}
