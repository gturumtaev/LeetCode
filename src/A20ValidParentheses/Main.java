package A20ValidParentheses;

import javax.xml.stream.events.DTD;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//Учитывая строку s, содержащую только символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка допустимой.
//Входная строка действительна, если:
//Открытые скобки должны закрываться скобками того же типа.
//Открытые скобки должны закрываться в правильном порядке.
//Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.
//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false
public class Main {
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

            if (!stack.isEmpty() && brackets.containsKey(c)) {
                if (brackets.get(c) != stack.pop()) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
