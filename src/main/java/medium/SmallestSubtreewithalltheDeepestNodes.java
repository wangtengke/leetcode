package medium;

import util.TreeNode;

import java.util.HashMap;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-08
 **/
public class SmallestSubtreewithalltheDeepestNodes {
//    public TreeNode subtreeWithAllDeepest(TreeNode root) {
//        return dfs(root, 0, new HashMap<>()).get(0);
//
//    }
//
//    public Map<Integer, TreeNode> dfs(TreeNode root, int count, Map map) {
//        map.clear();
//        if(root==null) {
//            map.put(0, root);
//            return map;
//        }
//        if(root.left == null && root.right == null) {
//            map.put(count, root);
//            return map;
//        }
//        if(root.left != null)
//            Map left = dfs(root.left, count + 1);
//        if(root.right != null)
//            Map right = dfs(root.right, count + 1);
//
//        if(left.ke > right.get(0)) {
//            map.put(left, root.left);
//        }
//        else if(right > left) {
//            map.put(right, root.right);
//        }
//        else {
//            map.put(left, root);
//        }
//        return map;
//    }

}
