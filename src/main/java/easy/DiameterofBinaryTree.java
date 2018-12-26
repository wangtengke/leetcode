package easy;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * Example:
 * Given a binary tree
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 * @author: wangtengke
 * @create: 2018-12-25
 **/
public class DiameterofBinaryTree {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        helper(root);
        return diameter;
    }

    private int helper(TreeNode root) {
        if(root==null)
            return 0;
        int leftDepth = helper(root.left);
        int rightDepth = helper(root.right);
        diameter = Math.max(diameter,leftDepth+rightDepth);
        return 1+Math.max(leftDepth,rightDepth);
    }
}
