package A104MaximumDepthOfBinaryTree;

import com.sun.source.tree.Tree;

//Given the root of a binary tree, return its maximum depth.
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//Учитывая корень двоичного дерева, верните его максимальную глубину.
//Максимальная глубина двоичного дерева — это количество узлов на самом длинном пути от корневого узла до самого дальнего листового узла.
//
//Example 1:
//
//
//Input: root = [3,9,20,null,null,15,7]
//Output: 3
//Example 2:
//
//Input: root = [1,null,2]
//Output: 2
public class Main {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(maxDepth(root1));
        TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(maxDepth(root2));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        return leftMaxDepth > rightMaxDepth ? leftMaxDepth + 1 : rightMaxDepth + 1;
    }
}

