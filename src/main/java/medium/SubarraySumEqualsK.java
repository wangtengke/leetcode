package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 *
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 * @author: wangtengke
 * @create: 2019-01-05
 **/
// Solution 2. From solution 1, we know the key to solve this problem is SUM[i, j].
// So if we know SUM[0, i - 1] and SUM[0, j], then we can easily get SUM[i, j].
// To achieve this, we just need to go through the array,
// calculate the current sum and save number of all seen PreSum to a HashMap.
// Time complexity O(n), Space complexity O(n).
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int res = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];
            res += map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        System.out.println(subarraySumEqualsK.subarraySum(new int[]{1, 2, 3, 4, 5, 6},7));
    }
}
