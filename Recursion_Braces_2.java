import java.util.List;
import java.util.Stack;

public class Recursion_Braces_2 {
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
        return isValidBraces_recursion(braces, 0, 0);
    }

    public static boolean isValidBraces_recursion(String braces, int storage, int pointer) {
        if (pointer >= braces.length()) return storage == 0;
        if (braces.charAt(pointer) == '(') {
            storage++;
        } else if (braces.charAt(pointer) == ')' && storage > 0) {
            storage--;
        } else {
            return false;
        }
        return isValidBraces_recursion(braces, storage, ++pointer);
    }
}
