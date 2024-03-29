package A1TwoSum;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Учитывая массив целых чисел nums и целочисленную цель, верните индексы двух чисел так, чтобы их сумма составляла цель.
//Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
//Вы можете вернуть ответ в любом порядке.
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        int[] nums1 = {3,2,4};
        int target1 = 6;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        int[] nums2 = {3, 3};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] get = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        get[0] = i;
                        get[1] = j;
                    }
                }
            }
        }
        return get;

    }
}
