package contest.contest116;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-23
 **/
public class NRepeatedElementinSize2NArray {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int mid = A.length/2;
        if(A[mid]==A[mid-1])
            return A[mid];
        else {
            if(A[0]==A[mid-1])
                return A[0];
            else
                return A[mid];
        }
    }

}
