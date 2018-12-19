package medium;

/**
 * @program: leetcode
 * @description:
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example:
 *
 * Input:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 * @author: wangtengke
 * @create: 2018-12-19
 **/
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int high = grid.length;
        int length = grid[0].length;
        int[][] dp = new int[high][length];
        for (int i = 0; i <length; i++) {
            for (int j = 0; j <high;j++) {
                if(i==0){
                    if(j==0){
                        dp[i][j]=grid[i][j];
                    }
                    else {
                        dp[i][j]=dp[i][j-1]+grid[i][j];
                    }
                }
                else {
                    if(j==0){
                        dp[i][j] = dp[i-1][j]+grid[i][j];
                    }
                    else {
                        dp[i][j] = Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);
                    }
                }
            }
        }
        return dp[length-1][high-1];
    }

    public static void main(String[] args) {
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        minimumPathSum.minPathSum(new int[][]{{1,2},{1,3},{2,1}});
    }
}
