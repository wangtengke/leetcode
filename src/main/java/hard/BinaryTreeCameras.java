package hard;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-17
 **/
public class BinaryTreeCameras {
    public int minCameraCover(TreeNode root) {

         int res1 = dfs(root.left, 0) + dfs(root.right, 0);
         System.out.println(res1);
        int res2 = dfs(root.left, 1) + dfs(root.right, 1);
        System.out.println(res2 +1);
        return Math.min(res1, res2+1);
    }

    public int dfs(TreeNode root, int f) {
        if(root==null) return f;
        int left=0;
        int right=0;
        if(f == 0) {
            left = dfs(root.left, 1);
            right = dfs(root.right, 1);
        }
        else if(f == 1) {
            left = dfs(root.left, 0);
            right = dfs(root.right, 0);
        }
        if(f==0) return left + right - 1;
        return left + right + f;
    }

    public static void main(String[] args) {
        BinaryTreeCameras binaryTreeCameras = new BinaryTreeCameras();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node2.left = node3;
        node2.right = node4;
        binaryTreeCameras.minCameraCover(node1);
    }
}
