package A217ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Учитывая числа целочисленного массива, верните true, если какое-либо значение встречается в массиве хотя бы дважды, и верните false, если каждый элемент различен.
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
//
//Constraints:
//
//1 <= nums.length <= 105
//-109 <= nums[i] <= 109
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
        int [] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2));
        int[] nums1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums1));

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() != nums.length;
    }
}
