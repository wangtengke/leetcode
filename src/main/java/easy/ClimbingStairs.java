package easy;

/**
 * @program: leetcode
 * @description:
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * @author: wangtengke
 * @create: 2018-12-19
 **/
public class ClimbingStairs {
    public int climbStairs(int n) {
        int result=0;
        int result1 = 1;
        int result2 = 2;
        if(n==0)
            return result;
        if(n==1)
            return result1;
        if(n==2)
            return result2;
        for(int i=2;i<n;i++){
            result = result1 + result2;
            result1 = result2;
            result2 = result;
        }
        return result;
    }

}
