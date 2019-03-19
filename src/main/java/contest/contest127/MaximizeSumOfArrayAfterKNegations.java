package contest.contest127;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-10
 **/
public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int count = 0;
        while (K > 0) {
            if(A[count]<0){
                A[count]= -A[count];
                count++;
                K--;
            }
            else {
               break;
            }
        }
        Arrays.sort(A);
        if(K%2==1){
            A[0]=-A[0];
        }
        int sum = 0;
        for (int i = 0; i <A.length ; i++) {
            sum +=A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        MaximizeSumOfArrayAfterKNegations m = new MaximizeSumOfArrayAfterKNegations();
        System.out.println(m.largestSumAfterKNegations(new int[]{1, 3, 2, 6, 7, 9},3));
    }
}
