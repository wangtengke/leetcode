package contest.contest124;

import util.TreeNode;

import java.util.LinkedList;

/**
 * @program: leetcode
 * @description:
 * User Accepted: 2327
 * User Tried: 2533
 * Total Accepted: 2384
 * Total Submissions: 4430
 * Difficulty: Easy
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 *
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 *
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 *
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 * Example 2:
 *
 *
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 * Example 3:
 *
 *
 *
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 *
 *
 * Note:
 *
 * The number of nodes in the tree will be between 2 and 100.
 * Each node has a unique integer value from 1 to 100.
 * @author: wangtengke
 * @create: 2019-02-17
 **/
public class CousinsinBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        int depth = 0;
        int dx = -1;
        int dy = -1;
        while (queue.size()!=0) {
            for(int sz = queue.size();sz>0;sz--) {
                TreeNode node = queue.pop();
                if(node.val==x)
                    dx = depth;
                if(node.val==y)
                    dy = depth;
                if((node.left!=null&&node.right!=null)&&((node.left.val==x&&node.right.val==y)||(node.right.val==x&&node.left.val==y)))
                    return false;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            depth++;
        }
        return dx == dy;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node3.right = node5;
        CousinsinBinaryTree cousinsinBinaryTree = new CousinsinBinaryTree();
        cousinsinBinaryTree.isCousins(node1,4,5);
    }
}
