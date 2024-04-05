package A100SameTree;
//Given the roots of two binary trees p and q, write a function to check if they are the same or not.
//Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
//Учитывая корни двух двоичных деревьев p и q, напишите функцию, проверяющую, совпадают они или нет.
//Два бинарных дерева считаются одинаковыми, если они структурно идентичны и узлы имеют одинаковое значение.
//
//Example 1:
//
//Input: p = [1,2,3], q = [1,2,3]
//Output: true
//Example 2:
//
//Input: p = [1,2], q = [1,null,2]
//Output: false
//Example 3:
//
//Input: p = [1,2,1], q = [1,1,2]
//Output: false
public class Main {
    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(p1, q1));
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(3));
        System.out.println(isSameTree(p2, q2));
        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println(isSameTree(p3, q3));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
