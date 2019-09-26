package medium;

import util.TreeNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-09
 **/
public class FlattenBinaryTreetoLinkedList {
    public TreeNode pre = null;
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        root.left =null;
        pre = root;
    }

    public static void main(String[] args) {
        FlattenBinaryTreetoLinkedList flattenBinaryTreetoLinkedList = new FlattenBinaryTreetoLinkedList();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;
        flattenBinaryTreetoLinkedList.flatten(n1);
    }

}
