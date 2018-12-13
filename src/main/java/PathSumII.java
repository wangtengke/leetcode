import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-13
 **/
public class PathSumII {
    List<Integer> innerlist = new ArrayList<>();
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null)
            return list;
        if(root.left == null && root.right==null){
            if(sum == root.val){
                innerlist.add((root.val));
                temp = innerlist;
                list.add(new ArrayList<Integer>(temp));
                innerlist.remove(innerlist.size()-1);
                return list;
            }
            return list;
        }
        innerlist.add((root.val));
        sum = sum -root.val;
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        innerlist.remove((innerlist.size()-1));
        return list;
    }
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(-2);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(-2);
        TreeNode node7 = new TreeNode(-1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node4.left = node7;
        PathSumII pathSumII = new PathSumII();
        pathSumII.pathSum(node1,3);
    }
}
