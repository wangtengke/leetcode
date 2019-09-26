package medium;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-28
 **/
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i: map.keySet()){
            int f = map.get(i);
            if(bucket[f]==null)
                bucket[f] = new LinkedList<>();
            bucket[f].add(i);
        }
        List<Integer> res = new LinkedList<>();
        for(int i= nums.length; i>=0 && res.size()<k; i--){
            if(bucket[i]!=null){
                res.addAll(bucket[i]);
//                k--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        topKFrequentElements.topKFrequent(new int[]{-1,2,1,3,4},2);
    }
}
