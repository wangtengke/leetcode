package easy;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 * @author: wangtengke
 * @create: 2018-12-25
 **/
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length/2;
        int begin = mid;
        int end = mid;
        TreeNode root = new TreeNode(nums[mid]);
        //todo sortedArrayToBST
        return null;
    }

    public static void main(String[] args) {
        ConvertSortedArraytoBinarySearchTree convertSortedArraytoBinarySearchTree = new ConvertSortedArraytoBinarySearchTree();
        convertSortedArraytoBinarySearchTree.sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
