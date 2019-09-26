package medium;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-22
 **/
public class MinimumCostTreeFromLeafValues {
    public int mctFromLeafValues(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        int[][] max = new int[n][n];
        for(int[] d: dp) Arrays.fill(d, Integer.MAX_VALUE/3);
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i==j) max[i][j] = arr[j];
                else max[i][j] = Math.max(max[i][j-1], arr[j]);
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=i+1;j<n; j++) {
                if(i==j) {
                    dp[i][j] = arr[i];
                    continue;
                }
                if(i+1==j) {
                    dp[i][j] = arr[i] * arr[j];
                    continue;
                }
                for(int k=i+1; k<=j-1; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k+1][j] + max[i][k] * max[k+1][j]);
                    System.out.println(dp[i][j]);
                }
            }
        }
        return dp[0][n-1];
    }

    public static void main(String[] args) {
        MinimumCostTreeFromLeafValues m  = new MinimumCostTreeFromLeafValues();
        m.mctFromLeafValues(new int[]{6,2,4});
//        List<Integer> list = new ArrayList<>();
//        list.remove()
    }

}
