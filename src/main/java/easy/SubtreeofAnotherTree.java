package easy;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 *
 * Example 1:
 * Given tree s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return true, because t has the same structure and node values with a subtree of s.
 * Example 2:
 * Given tree s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return false.
 * @author: wangtengke
 * @create: 2018-12-24
 **/
public class SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
       if(s==null)
           return t==null;
       return isSame(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if(s==null)
            return t==null;
        if(t==null)
            return s==null;
        if(s.val==t.val&&isSame(s.left,t.left)&&isSame(s.right,t.right)){
            return true;
        }
         return false;
    }
}
