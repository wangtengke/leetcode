package contest.contest115;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-16
 **/
public class CheckCompletenessofaBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
            return true;
        queue.offer(root.left);
        queue.offer(root.right);
        while (queue.size()!=0){
            TreeNode first = queue.remove();
            if(first==null)
                break;
            queue.offer(first.left);
            queue.offer(first.right);
        }
        while (queue.size()!=0){
            TreeNode first = queue.remove();
            if(first!=null)
                return false;
        }
        return true;
    }
}
