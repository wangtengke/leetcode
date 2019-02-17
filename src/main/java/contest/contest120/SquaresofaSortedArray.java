package contest.contest120;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-01-20
 **/
public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length ; i++) {
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
