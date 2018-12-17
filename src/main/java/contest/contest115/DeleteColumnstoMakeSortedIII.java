package contest.contest115;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * We are given an array A of N lowercase letter strings, all of the same length.
 *
 * Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.
 *
 * For example, if we have an array A = ["babca","bbazb"] and deletion indices {0, 1, 4}, then the final array after deletions is ["bc","az"].
 *
 * Suppose we chose a set of deletion indices D such that after deletions, the final array has every element (row) in lexicographic order.
 *
 * For clarity, A[0] is in lexicographic order (ie. A[0][0] <= A[0][1] <= ... <= A[0][A[0].length - 1]), A[1] is in lexicographic order (ie. A[1][0] <= A[1][1] <= ... <= A[1][A[1].length - 1]), and so on.
 *
 * Return the minimum possible value of D.length.
 * @author: wangtengke
 * @create: 2018-12-16
 **/
public class DeleteColumnstoMakeSortedIII {
    public int minDeletionSize(String[] A) {
        int[] dp = new int[A[0].length()];
        int max = 1;
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                boolean mark = true;
                // if all characters in column i are greater than j then its a valid subsequence
                for(String k : A){
                    if(k.charAt(j) > k.charAt(i)){
                        mark = false;
                        break;
                    }

                }

                if(mark)
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }

            max = Math.max(max,dp[i]);
        }

        return A[0].length() - max;
    }

    public static void main(String[] args) {
        DeleteColumnstoMakeSortedIII sortedIII = new DeleteColumnstoMakeSortedIII();
        String[] A = new String[2];
        A[0]="baabab";
        A[1]="aaaaaa";
        sortedIII.minDeletionSize(A);
    }
}
