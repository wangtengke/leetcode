package contest.contest117;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-30
 **/
public class UnivaluedBinaryTree {
    private int a = -1;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
            return true;
        if(a<0)
            a=root.val;
        else {
            if (a != root.val)
                return false;
        }
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}
