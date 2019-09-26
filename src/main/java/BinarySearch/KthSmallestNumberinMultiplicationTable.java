package BinarySearch;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-12
 **/
public class KthSmallestNumberinMultiplicationTable {
    public int findKthNumber(int m, int n, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                q.add(m*n);
            }
        }
        for(int i=0; i<k-1; k++) q.remove();
        return q.remove();
    }

}
