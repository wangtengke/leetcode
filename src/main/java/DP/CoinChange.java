package DP;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description: \
 * @author: wangtengke
 * @create: 2019-05-17
 **/
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i=0; i<coins.length; i++){
            if(coins[i]<=amount)
                dp[coins[i]] = 1;
        }
        for(int i=0; i<=amount; i++){
            if(dp[i]<Integer.MAX_VALUE) continue;
            for(int c: coins){
                if(i-c>0){
                    if(dp[i-c]<Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i], dp[i-c]+1);
                    }
                }

            }
        }
        return dp[amount]==Integer.MAX_VALUE? -1:dp[amount];
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        coinChange.coinChange(new int[]{2,5,10,1}, 27);
    }
}
