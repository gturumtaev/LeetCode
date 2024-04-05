package A20ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(isValid(s1));
        String s2 = "[()][]{}";
        System.out.println(isValid(s2));
        String s3 = "(]";
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!brackets.containsKey(c)) {
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

