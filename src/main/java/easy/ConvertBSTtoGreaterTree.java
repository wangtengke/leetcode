package easy;

import util.TreeNode;

import java.sql.SQLOutput;

/**
 * @program: leetcode
 * @description:
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
 *
 * Example:
 *
 * Input: The root of a Binary Search Tree like this:
 *               5
 *             /   \
 *            2     13
 *
 * Output: The root of a Greater Tree like this:
 *              18
 *             /   \
 *           20     13
 * @author: wangtengke
 * @create: 2018-12-25
 **/
public class ConvertBSTtoGreaterTree {
    int temp = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
            return null;

        convertBST(root.right);
        root.val = root.val+temp;
        temp = root.val;
        convertBST(root.left);

        return root;
    }
}
