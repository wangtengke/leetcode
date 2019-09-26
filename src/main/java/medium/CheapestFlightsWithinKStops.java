package medium;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-05
 **/
public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][][] dp = new int[n][n][K+1];
        for(int[][] d: dp){
            for(int[] t: d){
                Arrays.fill(t, Integer.MAX_VALUE);
            }
        }
        for(int i=0; i<=K; i++){
            if(i==0){
                for(int[] flight: flights){
                    int s = flight[0];
                    int d = flight[1];
                    int price = flight[2];
                    dp[s][d][0] = price;
                }
            }
            else{
                for(int[] flight: flights){
                    int s = flight[0];
                    int d = flight[1];
                    int price = flight[2];
                    for(int j=0; j<n ;j++){
                        dp[j][d][i] = dp[j][s][i-1]==Integer.MAX_VALUE?Integer.MAX_VALUE:dp[j][s][i-1]  + price;
                        System.out.println(dp[s][d][i]+"s: "+s+"d: "+d+"i: "+i);
                        // dp[j][d][i] += price;
                    }

                }
            }
        }
        return dp[src][dst][K]==(Integer.MAX_VALUE)? -1: dp[src][dst][K];
    }

    public static void main(String[] args) {
        CheapestFlightsWithinKStops cheapestFlightsWithinKStops = new CheapestFlightsWithinKStops();
        cheapestFlightsWithinKStops.findCheapestPrice(3,new int[][]{{0,1,100},{1,2,100},{0,2,500}},0,2,1);
    }

}
