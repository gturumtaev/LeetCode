package A1TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
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
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] =  map.get(target - nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }















//        int[] result = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            if (map.containsKey(target - numbers[i])) {
//                result[1] = i;
//                result[0] = map.get(target - numbers[i]);
//                return result;
//            }
//            map.put(numbers[i], i);
//        }
//        return result;
//    }
}
