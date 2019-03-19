package contest.contest127;

import util.TreeNode;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-10
 **/
public class ConstructBinarySearchTreefromPreorderTraversal {
    int pos = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return dfs(preorder, 999999999);
    }

    TreeNode dfs(int[] preorder, int lim)
    {
        if(pos >= preorder.length)return null;
        if(preorder[pos] > lim)return null;
        TreeNode root = new TreeNode(preorder[pos]);
        if(++pos >= preorder.length)return root;
        root.left = dfs(preorder, root.val);
        root.right = dfs(preorder, lim);
        return root;
    }

    public static void main(String[] args) {
        ConstructBinarySearchTreefromPreorderTraversal c = new ConstructBinarySearchTreefromPreorderTraversal();
        c.bstFromPreorder(new int[]{18, 7, 2, 4, 11, 10, 17, 14, 19});
    }
}
