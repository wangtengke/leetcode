package medium;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-28
 **/
public class DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            dp[i][i] =1;
            for(int j=i+1; j<=n; j++){
                dp[i][j]  = dp[i][j-1];
                if(j-1>=0 && Integer.valueOf(s.substring(j-1,j+1))<=26)
                    dp[i][j] += dp[i][j-2];

            }
        }

        return dp[0][n];
    }

    public static void main(String[] args) {
        DecodeWays decodeWays = new DecodeWays();
        decodeWays.numDecodings("12");
    }

}
