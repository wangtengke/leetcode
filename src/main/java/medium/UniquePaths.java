package medium;

/**
 * @program: leetcode
 * @description:
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * How many possible unique paths are there?
 * @author: wangtengke
 * @create: 2018-12-19
 **/
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(i==0){
                    dp[i][j]=1;
                }
                else {
                    if(j==0){
                        dp[i][j]=1;
                    }
                    else {
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                }
            }
        }
        return dp[n-1][m-1];
    }
}
