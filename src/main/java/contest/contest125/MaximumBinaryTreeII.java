package contest.contest125;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-02-24
 **/
public class MaximumBinaryTreeII {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        if(root.val < val){
            TreeNode ans = new TreeNode(val);
            ans.left = root;
            return ans;
        }
        TreeNode ans = new TreeNode(val);
        dfs(root,ans);
        return root;
    }

    private void dfs(TreeNode root, TreeNode ans) {
        if(root==null)
            return;
        if((root.right==null)||root.right.val<ans.val){
            TreeNode t = root.right;
            root.right = ans;
            ans.left = t;

            return;
        }
//        dfs(root.left,ans);
        dfs(root.right,ans);
    }
}
