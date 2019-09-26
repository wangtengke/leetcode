package Tree;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-07
 **/
public class LongestUnivaluePath {
    public int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null)
            return 0;
        int m = dfs(root);
        return Math.max(m, ans)-1;
    }

    public int dfs(TreeNode root){
        int cur = 0;
        if(root.left==null && root.right==null) return 1;
        int right = 0;
        int left = 0;
        if(root.left!=null){
            left = dfs(root.left);
            if(root.val==root.left.val)
                cur += left;
        }

        if(root.right!=null){
            right = dfs(root.right);
            if(root.val==root.right.val)
                cur += right;
        }

        ans = Math.max(ans, cur+1);

        if(root.left!=null && root.right!=null && root.left.val==root.val && root.right.val==root.val)
            return cur+1;
        if(root.right!=null && root.right.val==root.val)
            return right+1;
        if(root.left!= null && root.left.val==root.val)
            return left+1;
        return 1;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(1);
        TreeNode n6 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;
        LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();
        longestUnivaluePath.longestUnivaluePath(n1);
    }

}
