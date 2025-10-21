import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketCheckerTest {

    @Test
    void testBalancedBrackets() {
        assertTrue(BracketChecker.isBalanced("{}"));
        assertTrue(BracketChecker.isBalanced("()"));
        assertTrue(BracketChecker.isBalanced("[]"));
        assertTrue(BracketChecker.isBalanced("{[()]}"));
        assertTrue(BracketChecker.isBalanced("{([])}"));
    }

    @Test
    void testUnbalancedBrackets() {
        assertFalse(BracketChecker.isBalanced("{[}]"));
        assertFalse(BracketChecker.isBalanced("{(}"));
        assertFalse(BracketChecker.isBalanced("({}"));
        assertFalse(BracketChecker.isBalanced(")("));
        assertFalse(BracketChecker.isBalanced("((())"));
    }

    @Test
    void testEmptyAndNonBracketChars() {
        assertTrue(BracketChecker.isBalanced(""));
        assertTrue(BracketChecker.isBalanced("abc"));
        assertTrue(BracketChecker.isBalanced("(a[b]{c})"));
        assertFalse(BracketChecker.isBalanced("(a[b{c})"));
    }
}
