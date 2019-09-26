package DP;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-05
 **/
public class MaximumLengthofPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->
            a[1]-b[1]
        );
        int ret = 1;
        int pre = pairs[0][1];
        for (int i = 1; i <pairs.length ; i++) {
            if(pairs[i][0]>pre){
                ret++;
                pre = pairs[i][1];
            }
        }
        return ret;
    }
}
