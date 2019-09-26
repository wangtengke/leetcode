package KickStart.RoundA.A;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-26
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            int[] student = new int[n];
            for (int j = 0; j < n; j++) {
                student[j] = scanner.nextInt();
            }
            int res = solve(p, student);
            System.out.println("Case #"+String.valueOf(i+1)+": "+String.valueOf(res));
        }
    }

    private static int solve(int p, int[] student) {
        Arrays.sort(student);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < student.length-p+1; i++) {
            int sum = 0;
            for (int j = i; j < i+p; j++) {
                sum += student[i+p-1] - student[j];
            }
            min = Math.min(min, sum);
        }
        return min;
    }

}
