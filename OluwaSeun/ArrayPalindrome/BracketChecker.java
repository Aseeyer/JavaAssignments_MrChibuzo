import java.util.Stack;

public class BracketChecker {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']' || ch == '>') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!matches(top, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '<' && close == '>');
    }
}
