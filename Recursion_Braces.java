import java.util.List;
import java.util.Stack;

public class Recursion_Braces {
    public static void main(String[] args) {
        List<String> braces = List.of(
                "(()())()", // true
                "(())", // true
                "(((())))", // true

                "(((()", // false
                ")()", // false
                "(()", // false
                ")()())", // false
                ")(()())", // false
                ")(", // false
                "())", // false
                ")(()", // false
                "(((()))"); // false

        for (String b : braces) {
            System.out.println(isValidBraces(b));
        }
    }

    public static boolean isValidBraces(String braces) {
        Stack<Character> stack = new Stack<>();
        return isValidBraces_recursion(stack, braces, 0);
    }

    public static boolean isValidBraces_recursion(Stack<Character> bracesStack, String braces, int pointer) {
        if (pointer >= braces.length()) return bracesStack.isEmpty();
        if (braces.charAt(pointer) == '(') {
            bracesStack.push(braces.charAt(pointer));
        } else if (braces.charAt(pointer) == ')' && !bracesStack.isEmpty()) {
            bracesStack.pop();
        } else {
            return false;
        }
        return isValidBraces_recursion(bracesStack, braces, ++pointer);
    }
}
