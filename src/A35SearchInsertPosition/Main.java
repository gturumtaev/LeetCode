package A35SearchInsertPosition;
//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//
//Учитывая отсортированный массив различных целых чисел и целевое значение, верните индекс, если цель найдена.
//Если нет, верните индекс там, где он был бы, если бы он был вставлен по порядку.
//Вы должны написать алгоритм со сложностью выполнения O(log n).
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int k1 = 5;
        System.out.println(searchInsert(nums1, k1));
        int[] nums2 = {1, 3, 5, 6};
        int k2 = 2;
        System.out.println(searchInsert(nums2, k2));
        int[] nums3 = {1, 3, 5, 6};
        int k3 = 7;
        System.out.println(searchInsert(nums3, k3));
    }

    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) return nums.length;
        if (target < nums[0]) return 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) return i;
            if (target > nums[i] && target < nums[i + 1]) return i + 1;
        }

        return -1;
    }
}
