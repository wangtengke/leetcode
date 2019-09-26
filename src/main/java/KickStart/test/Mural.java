package KickStart.test;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 *
 *          4
 *          4
 *         1332
 *         4
 *         9583
 *         3
 *         616
 *         10
 *         1029384756
 * @author: wangtengke
 * @create: 2019-05-25
 **/
public class Mural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int res = solve(s,n);
            System.out.println("Case #"+String.valueOf(i+1)+": "+String.valueOf(res));//Case #1: 6
        }
    }

    private static int solve(String s, int n) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i < (n + 1) / 2) {
                sum += s.charAt(i)-'0';
                max = Math.max(max, sum);
            } else {
                sum = sum - s.charAt(i-(n+1)/2) + s.charAt(i);
                max = Math.max(max, sum);
            }

        }
        return max;
    }
}
