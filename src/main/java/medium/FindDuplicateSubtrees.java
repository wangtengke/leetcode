package medium;

import util.TreeNode;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-10
 **/
public class FindDuplicateSubtrees {
    Map<TreeNode, Integer> map = new HashMap<>();
    List<TreeNode> list = new ArrayList<>();
    List<TreeNode> r = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        for(int i=0; i<list.size(); i++) {
            boolean flag = false;
            for(TreeNode n: map.keySet()) {
                if(isSame(n, list.get(i))) {
                    map.put(n, map.get(n)+1);
                    flag = true;
                    break;
                }
            }
            if(!flag) map.put(list.get(i), 1);

        }
        for(TreeNode node: map.keySet()) {
            if(map.get(node)>1) {
                r.add(node);
            }
        }
        return r;
    }
    public boolean isSame(TreeNode node1, TreeNode node2) {
        if(node1==null && node2==null) return true;
        if(node1==null || node2==null) return false;
        if(node1.val!=node2.val) return false;
        return isSame(node1.left, node2.left) && isSame(node1.right, node2.right);
    }

    public void dfs(TreeNode root) {
        if(root==null) return;
        list.add(root);
        dfs(root.left);
        dfs(root.right);
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        TreeNode node4 = new TreeNode(4);
        node2.left = node4;
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(4);
        node3.left = node5;
        node3.right = node6;
        TreeNode node7 = new TreeNode(4);
        node5.left = node7;
        FindDuplicateSubtrees duplicateSubtrees = new FindDuplicateSubtrees();
        duplicateSubtrees.findDuplicateSubtrees(node1);
    }

}
