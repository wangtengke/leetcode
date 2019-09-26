package contest.contest137;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-19
 **/
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        for(int i: stones) q.add(i);
        while(q.size()>1){
            int first = q.poll();
            int second = q.poll();
            q.add(first-second);
        }
        return q.peek();
    }

    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        lastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1});
    }

}
