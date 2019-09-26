package medium;

import sun.reflect.generics.tree.Tree;
import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-03
 **/
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return helper(0, nums.length-1, nums, null);
//        return root.right;
    }

    public TreeNode helper(int begin, int end, int[] nums, TreeNode root){
        if(begin==end)
            return new TreeNode(nums[begin]);
        if(begin>end)
            return null;
        int index = begin;
        int val = nums[begin];
        for(int i=begin; i<=end; i++){
            if(nums[i]>nums[index]){
                val = nums[i];
                index = i;
            }
        }
        root =  new TreeNode(val);
        root.left = helper(begin, index-1, nums, root.left);
        root.right = helper(index+1, end, nums, root.right);
        return root;
    }

    public static void main(String[] args) {
        MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
        maximumBinaryTree.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
    }
}
