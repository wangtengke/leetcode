package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-22
 **/
public class UglyNumberII {
    public int nthUglyNumber(int n) {
        boolean[] dp = new boolean[100000000];
        dp[1] = true;
        dp[2] = true;
        dp[3] = true;
        dp[4] = true;
        dp[5] = true;
        if(n<=5) return n;
        int count = 5;
        for(int i=6; i<100000000; i++){
            if((i%2==0 && dp[i/2])||(i%3==0 && dp[i/3])||(i%5==0&& dp[i/5])){
                dp[i] = true;
                count++;
                System.out.println(i);
                if(count ==n) return i;
                break;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        UglyNumberII uglyNumberII = new UglyNumberII();
        uglyNumberII.nthUglyNumber(8);
        Set<int[]> set = new HashSet<>();
    }

}
