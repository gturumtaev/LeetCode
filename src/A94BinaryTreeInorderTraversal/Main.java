package A94BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Given the root of a binary tree, return the inorder traversal of its nodes' values.
//Учитывая корень двоичного дерева, верните обход значений его узлов в порядке убывания.
//
//Example 1:
//
//Input: root = [1,null,2,3]
//Output: [1,3,2]
//Example 2:
//
//Input: root = []
//Output: []
//Example 3:
//
//Input: root = [1]
//Output: [1]
public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(inorderTraversal(node1));
        TreeNode node2 = new TreeNode();
        System.out.println(inorderTraversal(node2));
        TreeNode node3 = new TreeNode(1);
        inorderTraversal(node3);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
