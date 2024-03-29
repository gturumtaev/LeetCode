package A9PalindromeNumber;
//Given an integer x, return true if x is a palindrome, and false otherwise.
//Учитывая целое число x, верните true, если x является палиндром и false в противном случае.
//
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
//
//Follow up: Could you solve it without converting the integer to a string?
//Продолжение: не могли бы вы решить эту проблему, не преобразуя целое число в строку?

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x1 = 121;
        System.out.println(isPalindrome(x1));
        int x2 = -121;
        System.out.println(isPalindrome(x2));
        int x3 = 10;
        System.out.println(isPalindrome(x3));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reversed = 0;
        int temp = x;
        int digit;

        while (temp != 0) {
            digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);
    }
}
