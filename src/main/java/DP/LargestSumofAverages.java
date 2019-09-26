package DP;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-10
 **/
public class LargestSumofAverages {
    public double largestSumOfAverages(int[] A, int K) {
        int N = A.length;
        double[][] dp = new double[A.length+1][A.length+1];
        double cur = 0;
        for(int i=0; i<A.length;i++){
            cur += A[i];
            dp[i+1][1] = cur/(i+1);
        }
        return search(A, N, dp, K);
    }
    public double search(int[] A, int N, double[][] dp, int K){
        if(dp[N][K]>0) return dp[N][K];
        if(N<K) return 0;
        double cur = 0;
        for(int i=N; i>=0; i--){
            cur += A[i];
            dp[N][K] = Math.max(dp[N][K], search(A, N, dp,K-1)+cur/(N-i));
        }
        return dp[N][K];
    }
}
