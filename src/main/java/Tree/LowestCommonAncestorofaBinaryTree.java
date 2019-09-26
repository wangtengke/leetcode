package Tree;

import util.TreeNode;

import java.util.HashMap;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-07
 **/
public class LowestCommonAncestorofaBinaryTree {
    TreeNode t = new TreeNode(1);
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        boolean left = dfs(root, p.val);
        boolean right = dfs(root, q.val);
        if((left && right)||(root==p && right)||(root==q && left)){
            return root;
        }
        if(root.left!=null) {
            if(lowestCommonAncestor(root.left, p, q)!=null)
                return root.left;
        }
        if(root.right!=null){
            if(lowestCommonAncestor(root.right, p, q)!=null)
                return root.right;
        }
        return null;
    }

    public boolean dfs(TreeNode root, int val){
        if(root==null)
            return false;
        if(root.val==val)
            return true;
        boolean left = dfs(root.left, val);
        boolean right = dfs(root.right, val);
        return left||right;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n1.left = n2;
        LowestCommonAncestorofaBinaryTree lowestCommonAncestorofaBinaryTree = new LowestCommonAncestorofaBinaryTree();
        lowestCommonAncestorofaBinaryTree.lowestCommonAncestor(n1, n1, n2);
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (Integer i: map.entrySet()) {
//
//        }
    }

}
