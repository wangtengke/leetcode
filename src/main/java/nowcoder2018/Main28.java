package nowcoder2018;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-20
 **/
public class Main28 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i: input) {
            q.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<k; i++) list.add(q.poll());
        return list;
    }

}
