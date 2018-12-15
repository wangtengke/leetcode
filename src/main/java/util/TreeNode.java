package util;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-14
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }


    public String toString() {
        if(this==null)
            return null;
        System.out.println("node:"+val);
        this.left.toString();
        this.right.toString();
        return null;
    }
}
