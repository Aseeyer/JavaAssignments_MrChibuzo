public class ArrayPalindrome {

    public static boolean[] checkPalindromes(String[] words) {
        
        boolean[] palindromeResults = new boolean[words.length];

        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {

            String word = words[wordIndex].toLowerCase().trim();

            boolean isPalindrome = true;

            for (int left = 0, right = word.length() - 1; left < right; left++, right--) {

                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
            }

            palindromeResults[wordIndex] = isPalindrome;
        }

        return palindromeResults;
    }





    public static void main(String[] args) {

        String[] someWords = {"madam","27", "Eze", "racecar", "hello", "noon", "World", "dad", "semicolon", "232"};

        boolean[] results = checkPalindromes(someWords);


        for (int wordIndex = 0; wordIndex < results.length; wordIndex++) {
            System.out.println(someWords[wordIndex] + " -> " + results[wordIndex]);
        }
    }
}
