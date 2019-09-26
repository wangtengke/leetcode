package DP;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-10
 **/
public class TargetSum {
    public int ans = 0;
    public int findTargetSumWays(int[] nums, int S) {

        dfs(0,0,nums,S);
        return ans;
    }

    public void dfs(int now ,int begin, int[] nums, int S){
        if(begin == nums.length){
            if(now == S)
                ans++;
            return;
        }
        dfs(now-nums[begin],begin+1,nums,S);

        dfs(now+nums[begin],begin+1,nums,S);
    }

}
