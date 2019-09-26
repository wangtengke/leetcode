package medium;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-05
 **/
public class ReorderedPowerof2 {
    public boolean reorderedPowerOf2(int N) {
        char[] a1 = String.valueOf(N).toCharArray();
        Arrays.sort(a1);
        for(double i=0; i<=31; i++) {
            int num = (int) Math.pow(2.0, i);
            char[] a2 =  String.valueOf(num).toCharArray();
            Arrays.sort(a2);
            if(a1.equals(a2)) return true;
        }
        return false;
    }

}
