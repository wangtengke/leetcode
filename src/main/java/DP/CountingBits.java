package DP;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-31
 **/
public class CountingBits {
    public int[] countBits(int num) {
        //ret[i] = ret[i/2] + i%2
        int[] ret = new int[num+1];
        for (int i = 1; i <= num ; i++) {
            ret[i] = ret[i/2] + i%2;
        }
        return ret;
    }
}
