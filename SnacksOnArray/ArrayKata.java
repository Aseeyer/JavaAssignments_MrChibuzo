public class ArrayKata{
    public static int maximumInArray(int[] numbers){
        int largest = numbers[0];
        for (int numberInArray = 1; numberInArray < numbers.length; numberInArray++){
            if (numbers[numberInArray] > largest){
                largest = numbers[numberInArray]
            }
        }return largest;
    }


    public static int minimumInArray(int[] numbers) {
        int smallest = numbers[0];
        for (int numberInArray = 1; numberInArray < numbers.length; numberInArray++) {
            if (numbers[numberInArray] < smallest) {
                smallest = numbers[numberInArray];            
            }
        } return smallest;
    }


    
    public static int sumOf(int[] numbers) {
        int sumOfArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfArray += numbers[i];
        }return sumOfArray;
    }



    public static int sumOfEvenNumbersIn(int[] numbers) {
        int sumOfEvenNumber = 0;
        for (int numberInArray = 0; numberInArray < numbers.length; numberInArray++) {
            if (numbers[numberInArray] % 2 == 0) {
                sumOfEvenNumber += numbers[numberInArray];
            }
        }
        return sumOfEvenNumber;
    }



    public static int sumOfOddNumbersIn(int[] numbers) {
        int sum = 0;
        for (int numberInArray = 0; numberInArray < numbers.length; numberInArray++) {
            if (numbers[numberInArray] % 2 != 0) {
                sum += numbers[numberInArray];
            }
        }
        return sum;
    }

    

    public static int[] maximumAndMinimumOf(int[] numbers) {
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int numberInArray = 1; numberInArray < numbers.length; numberInArray++) {
            if (numbers[numberInArray] > largest) {
                largest = numbers[numberInArray];
            }
            if (numbers[numberInArray] < smallest) {
                smallest = numbers[numberInArray];
            }
        }return new int[]{largest, smallest};
    }



    public static int[] evenNumbersIn(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index] = number;
                index++;
        }
    }return evenNumbers;
}



    public static int[] oddNumbersIn(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }

        int[] oddNumbers = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers[index] = number;
                index++;
            }
        }return oddNumbers;
    }



    public static int numberOfEvenNumbersIn(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }return count;
    }



    public static int numberOfOddNumbersIn(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }return count;
    }



    public static int numberOfNegativeNumbersIn(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }return count;
    }










}