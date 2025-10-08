import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayPalindromeTest {

    @Test
    void testAllPalindromes() {
        String[] words = {"madam", "racecar", "noon", "da1d"};
        boolean[] expected = {true, true, true, false};
        boolean[] result = ArrayPalindrome.checkPalindromes(words);

        assertArrayEquals(expected, result, "They are all palindromes");
    }


    @Test
    void testNoPalindromes() {
        String[] words = {"hello", "world", "java", "semicolon"};
        boolean[] expected = {false, false, false, false};
        boolean[] result = ArrayPalindrome.checkPalindromes(words);

        assertArrayEquals(expected, result, "None of these words are palindromes");
    }



    @Test
    void testMixedWords() {
        String[] words = {"madam", "hello", "noon", "java"};
        boolean[] expected = {true, false, true, false};
        boolean[] result = ArrayPalindrome.checkPalindromes(words);

        assertArrayEquals(expected, result, "Mixed palindrome and non-palindrome words");
    }

    
    @Test
    void testCaseAndWhitespace() {
        String[] words = {" Madam ", "RaceCar", "  NooN "};
        boolean[] expected = {true, true, true};
        boolean[] result = ArrayPalindrome.checkPalindromes(words);

        assertArrayEquals(expected, result, "Should ignore case and whitespace");
    }

    @Test
    void testNumbersAsStrings() {
        String[] words = {"121", "232", "12321", "456"};
        boolean[] expected = {true, true, true, false};
        boolean[] result = ArrayPalindrome.checkPalindromes(words);

        assertArrayEquals(expected, result, "Numeric strings should also be checked correctly");
    }

    @Test
    void testEmptyAndSingleCharacterStrings() {
        String[] words = {"", "a", "b", "cc"};
        boolean[] expected = {true, true, true, true};
        boolean[] result = ArrayPalindrome.checkPalindromes(words);

        assertArrayEquals(expected, result, "Empty and single-character strings should be palindromes");
    }

    @Test
    void testEmptyArray() {
        String[] words = {""};
        boolean[] expected = {true};
        boolean[] result = ArrayPalindrome.checkPalindromes(words);
        assertArrayEquals(expected, result, "Empty array should be palindromes");
    }
}
