package DP;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-31
 **/
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int ret = 0;
        for (int i = len-1; i >= 1; i--) {
            if(cost[i]>=cost[i-1]) {
                ret += cost[i - 1];
                i--;
            }
            else
                ret += cost[i];
        }
        int ret2 = 0;
        for (int i = 0; i <len-1 ; i++) {
            if(cost[i]>=cost[i+1]){
                ret2 += cost[i+1];
                i++;
            }
            else
                ret2 += cost[i];
        }
        return Math.min(ret,ret2);
    }

}
