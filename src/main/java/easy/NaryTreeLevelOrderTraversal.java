package easy;

import util.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-06
 **/
public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root==null)
            return list;
        Queue<Node> q = new LinkedList<>();
        while(q.size()!=0){
            int size = q.size();
            Queue<Node> qq = new LinkedList<>();
            List<Integer> cur = new LinkedList<>();
            while(size-->0){
                Node n = q.poll();
                while(n.children.size()!=0){
                    Node c = n.children.remove(0);
                    cur.add(c.val);
                    qq.add(c);
                }
            }
            list.add(new LinkedList(cur));
            cur.clear();
        }
        return list;
    }
}
