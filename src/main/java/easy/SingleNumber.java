package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 * @author: wangtengke
 * @create: 2018-12-24
 **/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i],1+map.get(nums[i]));
            }
        }
        int res=0;
       for(Integer key :map.keySet()){
           if(map.get(key)==1) {
               res= key;
           }
       }
       return res;
    }
}
