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
        Map<String,Integer> map = new HashMap<>();
        String[] arr = new String['n' - 'a' + 1];
        for(int i = 0,j = 'a'; i < arr.length; i++,j++){
            arr[i] = j+"";
            map.put(String.valueOf(j),i+1);
//            result += j+" ";//连起来，空格隔开
        }
        for(String str :A){
           for (int i = 0;i<str.length();i++){

           }
        }
        return 0;
    }

}
