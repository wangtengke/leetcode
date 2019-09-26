package cmbcc.MGeeker;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-21
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int res = solve(grid, m, n);
        System.out.println(res);
    }

    private static int solve(int[][] grid, int m, int n) {
        int max = 0;
        int[] col = new int[n];
        int[] row = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                col[i] = Math.max(col[i], grid[i][j]);
                row[j] = Math.max(row[j], grid[i][j]);
            }
        }

        return 0;
    }

}
