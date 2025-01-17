package A66PlusOne;

import java.util.Arrays;

//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
//Вам дано большое целое число, представленное в виде целочисленного массива цифр, где каждая цифра[i] — это i-я цифра целого числа.
//Цифры упорядочены от наиболее значимого к наименее значимому, слева направо. Большое целое число не содержит ведущих нулей.
//Увеличиваем большое целое число на единицу и возвращаем результирующий массив цифр.
//
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
public class Main {
    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits1)));
        int[] digits2 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(digits2)));
        int[] digits3 = {9};
        System.out.println(Arrays.toString(plusOne(digits3)));
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        while (digits[index] == 9) {
            digits[index] = 0;
            index--;

            if (index < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (index >= 0) {
            digits[index]++;
        }
        return digits;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////        Самостоятельное решение
////        int digit = 0;
////        for (int i = 0; i < digits.length; i++) {
////            digit = digit * 10 + digits[i];
////        }
////        int temp = digit + 1;
////        int length = String.valueOf(temp).length();
////        int[] ans = new int[length];
////        for (int i = length - 1; i >= 0; i--) {
////            ans[i] = temp % 10;
////            temp /= 10;
////        }
//        return ans;
    }
}
