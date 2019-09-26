package BinarySearch;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-12
 **/
public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < m*n-1; i++) {
            q.add(matrix[i/n][i%n]);
        }
        for (int i = 0; i <k-1 ; i++) {
            q.remove();
        }
        return q.remove();
    }

}
