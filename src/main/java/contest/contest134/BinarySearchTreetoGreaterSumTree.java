package contest.contest134;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-05
 **/
public class BinarySearchTreetoGreaterSumTree {
    public int val = 0;
    public TreeNode bstToGst(TreeNode root) {

        dfs(root);
        return root;
    }

    public void dfs(TreeNode root){
        if(root.left==null&& root.right==null) {
            root.val += val;
            val = root.val;
            return;
        }
        if(root.right!=null){
            dfs(root.right);
        }
        root.val += val;
        val = root.val;
        if(root.left!=null){
            dfs(root.left);
        }
    }

    public static void main(String[] args) {
        BinarySearchTreetoGreaterSumTree binarySearchTreetoGreaterSumTree = new BinarySearchTreetoGreaterSumTree();
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(0);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(3);
        TreeNode n9 = new TreeNode(8);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n5.right = n8;
        n7.right = n9;
        binarySearchTreetoGreaterSumTree.bstToGst(n1);
    }
}
