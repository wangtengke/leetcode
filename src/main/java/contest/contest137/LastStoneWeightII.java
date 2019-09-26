package contest.contest137;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-19
 **/
public class LastStoneWeightII {
    public int lastStoneWeightII(int[] stone) {
        int[] s = stone;
        Arrays.sort(s);
        int[][] dp = new int[s.length][s.length];
        for(int i=0; i<s.length; i++){
            dp[i][i] = s[i];
        }
        for(int i=2; i<s.length; i++){
            for(int j=i+1; j<s.length; j++){
                for(int k=i; k<=j; k++){
                    // if(k==i) dp[i][k] = s
                    dp[i][j] = Math.min(dp[i][k]-dp[k][j], dp[i][j]);
                }
            }
        }
        return dp[0][s.length-1];
    }

    public static void main(String[] args) {
        LastStoneWeightII lastStoneWeightII = new LastStoneWeightII();
        lastStoneWeightII.lastStoneWeightII(new int[]{21,26,31,33,40});
    }
    // [1,2,4,8,16,32,64,12,25,51]
}
