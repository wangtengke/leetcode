package contest.contest131;

import util.TreeNode;

import java.util.ArrayList;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-07
 **/
public class SumofRootToLeafBinaryNumbers {
    public long ret = 0;
    public int sumRootToLeaf(TreeNode root) {
        long sum = 0;
        getSum(root,sum);
        return (int)ret%(1000000000+7);
    }

    private void getSum(TreeNode root,long sum) {
        if(root.left==null&&root.right==null){
            sum = (sum*2 + root.val)%(1000000000+7);
            ret += sum;
            return;
        }
        sum = (sum*2 + root.val)%(1000000000+7);
        if(root.left !=null)
        getSum(root.left,sum);
        if(root.right !=null)
        getSum(root.right,sum);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(1);
        node.left = node2;
        node.right = node3;
        node2.left =node4;
        node2.right =  node5;
        node3.left = node6;
        node3.right = node7;
        SumofRootToLeafBinaryNumbers sumofRootToLeafBinaryNumbers = new SumofRootToLeafBinaryNumbers();
        System.out.println(sumofRootToLeafBinaryNumbers.sumRootToLeaf(node));
    }
}
