package A88MergeSortedArray;

import java.lang.reflect.Array;
import java.util.Arrays;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
//and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements
//that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
//Вам даны два целочисленных массива nums1 и nums2, отсортированные в неубывающем порядке:
//и два целых числа m и n, представляющие количество элементов в nums1 и nums2 соответственно.
//Объединяем nums1 и nums2 в один массив, отсортированный в неубывающем порядке.
//Окончательный отсортированный массив не должен возвращаться функцией, а должен храниться внутри массива nums1.
//Для этого nums1 имеет длину m + n, где первые m элементов обозначают элементы
//это должно быть объединено, а последние n элементов установлены в 0 и их следует игнорировать. nums2 имеет длину n.
//
//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
public class Main {
    public static void main(String[] args) {
        int[] nums11 = {1, 2, 3, 0, 0, 0};
        int[] nums22 = {2, 5, 6};
        int m1 = 3;
        int n1 = 3;
        merge(nums11, m1, nums22, n1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int k = n - 1;
        int e = nums1.length - 1;

        while (k >= 0) {
            if (i >= 0 && nums1[i] >= nums2[k]) {
                nums1[e] = nums1[i];
                i--;
                e--;
            } else {
                nums1[e] = nums2[k];
                k--;
                e--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
