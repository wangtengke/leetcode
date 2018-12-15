package easy;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * You are given a binary tree in which each node contains an integer value.
 *
 * Find the number of paths that sum to a given value.
 *
 * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
 *
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 *
 * Example:
 *
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * Return 3. The paths that sum to 8 are:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
 * @author: wangtengke
 * @create: 2018-12-14
 **/
public class PathSumIII {
    public int result = 0;
    public List<Integer> queue = new LinkedList<>();
    public int pathSum(TreeNode root, int sum) {
        if(root==null)
            return result;
        curPathSum(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return result;
    }
    public int curPathSum(TreeNode root, int sum){
        if(root ==null){
            return result;
        }
        System.out.println(String.valueOf(root.val)+"*******"+String.valueOf(sum));
//        if(root.right==null && root.left==null) {
//            if(sum == root.val){
//                result +=1;
//                return result;
//            }
//            return result;
//        }

        sum = sum - root.val;
        if(sum==0){
            result += 1;
            System.out.println("result += 1");
        }

        curPathSum(root.left,sum);
        curPathSum(root.right,sum);
        return result;
    }
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(11);
        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(-2);
        TreeNode node9 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node4.left = node7;
        node4.right = node8;
        node5.right = node9;
        PathSumIII pathSumIII = new PathSumIII();
        System.out.println(pathSumIII.pathSum(node1,8));
    }
}
