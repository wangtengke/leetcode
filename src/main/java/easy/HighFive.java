package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-16
 **/
public class HighFive {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int[] item: items){
            if(!map.containsKey(item[0])){
                map.put(item[0], new PriorityQueue<>((a,b)->b-a));
            }
            map.get(item[0]).add(item[1]);
        }
        int n = map.size();
        int[][] res = new int[n][2];
        for(int i: map.keySet()){
            Queue<Integer> q = map.get(i);
            int count = 0;
            int sum = 0;
            while(!q.isEmpty() && count<5);
        }
        return null;
    }
}
