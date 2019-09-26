package KickStart.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-25
 **/
//2
//2 3 1 2 1 2 1 1 9
//10 10 10001 10002 10003 10004 10005 10006 89273
//2 2 1 2 1 2 1 1 9
//2 4 1 2 1 2 1 1 9
//
public class KickstartAlarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e1 = scanner.nextInt();
            int e2 = scanner.nextInt();
            int f = scanner.nextInt();

            long res = solve(n, k, x1, y1, c, d, e1, e2, f);
            System.out.println("Case #"+String.valueOf(i+1)+": "+String.valueOf(res));//Case #1: 52
        }

        
    }

    private static long solve(int n, int k, int x1, int y1, int c, int d, int e1, int e2, int f) {
        long[] arr = new long[n];
        long x = x1;
        long y = y1;
        for (int i = 0; i < n; i++) {
            long a = (x+y)%f;
            arr[i] = a;
            long x_temp = (c * x + d * y +e1)%f;
            long y_temp = (c * y + d * x + e2)%f;
            x = x_temp;
            y = y_temp;
        }
        long sum = 0;
        int[][] dp = new int[n][n];
        for (int i = 1; i <=n; i++) {
            // diff size sum
            for (int j = 0; j < arr.length; j++) {
                List<Long> cur = new LinkedList<>();
                sum =  (sum +dfs(j, i, arr, cur, 0, dp,k))%1000000007;
            }

        }
        return sum;
    }

    private static long dfs(int index, int size, long[] arr, List<Long> cur, long sum, int[][] dp, int k) {
        if(cur.size()==size){
            for (int j = 1; j <= k; j++) {
                for (int i = 0; i < cur.size(); i++) {
                    // single sum
                    sum += (cur.get(i) *Math.pow((i+1),j))%1000000007;
                }
            }

            return sum;
        }
        if(index==arr.length) return 0;

            cur.add(arr[index]);
            // same size sum
            sum = (sum + dfs(index+1, size, arr, cur, 0, dp, k))%1000000007;
//            cur.remove(cur.size()-1);

        return sum;

    }

}
