package nowcoder2018;

import util.TreeNode;

import java.util.PriorityQueue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-11
 **/
public class Main31 {
    boolean isSymmetrical(TreeNode root)
    {
        if(root==null) return true;
        return dfs(root.left, root.right);
    }
    public boolean dfs(TreeNode left, TreeNode right) {
        if(left==null && right==null) return true;
        if(left==null || right == null) return false;
        if(left.val!=right.val) return false;

        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }

    public static void main(String[] args) {
        Main31 m = new Main31();
        TreeNode node = new TreeNode(8);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(7);
        node.left = node2;
        node.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;

        System.out.println(m.isSymmetrical(node));
    }

}
