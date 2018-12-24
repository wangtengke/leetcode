package easy;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * Note:
 * Then length of the input array is in range [1, 10,000].
 * The input array may contain duplicates, so ascending order here means <=.
 * @author: wangtengke
 * @create: 2018-12-24
 **/
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] origin =new int[nums.length];
        origin = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int begin = 0;
        int end = nums.length-1;
        while (origin[begin]==nums[begin]&&begin<end){
            begin++;
        }
        while (origin[end]==nums[end]&&end>begin){
            end--;
        }

        return end-begin==0?0:end-begin+1;
    }
}
