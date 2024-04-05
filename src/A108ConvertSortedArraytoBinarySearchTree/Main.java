package A108ConvertSortedArraytoBinarySearchTree;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeCellRenderer;

//Given an integer array nums where the elements are sorted in ascending order, convert it to a
//height-balanced binary search tree.
//Учитывая целочисленный массив nums, элементы которого отсортированы в порядке возрастания, преобразуйте его в
//двоичное дерево поиска со сбалансированной высотой.
//
//Example 1:
//
//Input: nums = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//
//Example 2:
//
//Input: nums = [1,3]
//Output: [3,1]
//Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {-10, -3, 0, 5, 9};
        System.out.println(sortedArrayToBST(nums1));
        int[] nums2 = {1,3};
        System.out.println(sortedArrayToBST(nums2));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = buildSubBST(nums, 0, nums.length - 1);
        return root;
    }

    private static TreeNode buildSubBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildSubBST(nums, start, mid - 1);
        node.right = buildSubBST(nums, mid + 1, end);
        return node;
    }


}
