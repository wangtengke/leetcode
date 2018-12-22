package easy;

import util.TreeNode;

import java.util.LinkedList;

/**
 * @program: leetcode
 * @description:
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * @author: wangtengke
 * @create: 2018-12-22
 **/
public class SymmetricTree {
    private LinkedList<Integer> dueue = new LinkedList<>();
    private LinkedList<Integer> dueue2 = new LinkedList<>();
    public boolean isSymmetric(TreeNode root) {
       if(root==null)
           return true;
       return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return isMirror(left.left,right.right)&&isMirror(left.right,right.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        SymmetricTree symmetricTree = new SymmetricTree();
        System.out.println(symmetricTree.isSymmetric(root));
    }
}
