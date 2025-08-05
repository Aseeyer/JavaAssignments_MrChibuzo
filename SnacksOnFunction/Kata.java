public class Kata {

// 1. checking if it is even or odd using boolean

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

/* 2. A number is prime if it has exactly two distinct positive divisors: 1 and the number itself. This means it's only divisible by 1 and the number itself, with no remainder. 
every number is divisible by 1 and itself, so if an extra number above the sqrt can divide it then its not prime. */

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

// 3. we are to get the difference between two numbers and return the absolute value
    public static int subtract(int a, int b) {
        return Math.abs(a - b);
    }

/* 4. we are using float, that takes 2 integers and returns the quotient, return 0 if int 2 is = 0. using float to ensure that our result is not an int */
    public static float divide(int a, int b) {
        if (b == 0) return 0.0f;
        return (float) a / b;
    }

/* 5.  we are getting the factors of a number and summing the total number of factors it has. so we check for numbers that can devide it without any remainder and then update our count to know how many times we got a number */
    public static int factorOfNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        return count;
    }

// 6. we are checking for if a number has a sqrt. if it does, i return true. casting it to int because we don't want a double.
    public static boolean isSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

// 7. Converting the number to a string simplifies reversing and comparing for palindrome check.
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

/* 8. we first calculates the factorial of a given number. Starts from 2 and multiplies up to the number itself. Uses long to handle large results. */

    public static long factorialOf(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

/* 9. Returns the square of a given number as a long. Useful for avoiding integer overflow when squaring large numbers. */
    public static long squareOf(int number) {
        return (long) number * number;
    }
}
