package easy;

/**
 * @program: leetcode
 * @description:
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * @author: wangtengke
 * @create: 2018-12-17
 **/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;//设置最小值
        int sum = 0;//每一个分组的和
        int i = 0;
        while(i < nums.length){
            sum += nums[i];//每一个分组的前n项和
            if(max < sum){
                max = sum;//取最大和
            }
            if(sum < 0){//假设<0。分组结束，開始下一组
                sum = 0;
            }
            i++;
        }
        return max;
    }
}
