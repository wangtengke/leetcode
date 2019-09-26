package DP;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-05
 **/
public class CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        if(n==1)
            return 10;
        int[] dp = new int[n+1];
        dp[1]=10;
        dp[2]= dp[1]+81;
        int ret = 1;
        for(int j=3; j<=n; j++){
            int temp = 1;
            for(int i=j; i>=2;i--){
                if(11-i<=0)
                    continue;
                temp = temp * (11-i);
            }
            temp = temp * 9;
            dp[j] = dp[j-1]+ temp;
        }
        return dp[n];

    }

    public static void main(String[] args) {
        CountNumberswithUniqueDigits countNumberswithUniqueDigits = new CountNumberswithUniqueDigits();
        countNumberswithUniqueDigits.countNumbersWithUniqueDigits(4);
    }
}
