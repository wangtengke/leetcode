package DP;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-15
 **/
public class LongestArithmeticSequence {
    public int longestArithSeqLength(int[] A) {
        //b-a , j , nums
        HashMap<Integer,HashMap<Integer,Integer>> dp = new HashMap<>();
//        int[][] dp = new int[10001][2001];
//        Arrays.sort(A);
        int res = 2;
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                int a = A[i];
                int b = A[j];
                HashMap<Integer, Integer> map = dp.getOrDefault(b-a,new HashMap<Integer, Integer>());

                int max = Math.max(map.getOrDefault(j,0),map.getOrDefault(i,0)+1);
                map.put(j,max);
                res = Math.max(res, max +1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LongestArithmeticSequence longestArithmeticSequence = new LongestArithmeticSequence();
        longestArithmeticSequence.longestArithSeqLength(new int[]{3,6,9,12});
    }
}
