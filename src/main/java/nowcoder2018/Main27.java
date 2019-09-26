package nowcoder2018;

import util.TreeNode;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-20
 **/
public class Main27 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return dfs(pre, in);
    }

    public TreeNode dfs(int[] pre, int[] in) {
        if(pre.length==0 || in.length==0) return null;
        TreeNode root = new TreeNode(pre[0]);
        System.out.println(root.val);
        int index = 0;
        for(int i=0; i<pre.length; i++) {
            if(pre[0]==in[i]) {
                index = i;
                break;
            }
        }
        TreeNode left = dfs(Arrays.copyOfRange(pre, 1, 1+index),  Arrays.copyOfRange(in, 0, index));
        TreeNode right = dfs(Arrays.copyOfRange(pre, 1+index, pre.length),  Arrays.copyOfRange(in, index+1, in.length));
        root.left = left;
        root.right = right;
        return root;
    }

}
