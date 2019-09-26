package nowcoder2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int res = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        int[][] area = new int[n][n];

        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            String[] split = line.split(",");
            if (split.length != n) {
                throw new IllegalArgumentException("错误输入");
            }
            int j = 0;
            for (String num : split) {
                area[i][j++] = Integer.parseInt(num);
            }
        }

        int minimumTimeCost = getMinimumTimeCost(n,area);
        System.out.println(minimumTimeCost);
    }

    /** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    private static int getMinimumTimeCost(int n, int[][] area) {

        boolean[][] memory = new boolean[n][n];
//        for(int[] m: memory) {
//            Arrays.fill(m, 999999999);
//        }

        int[][] dict ={{0,2},{2,0},{-2,0},{0,-2},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int i=0; i<n; i++) {
            dfs(n,1, i, area, memory, area[1][i], dict);
        }
        return res;
    }

    private static void dfs(int n, int i, int j, int[][] area, boolean[][] memory, int count, int[][] dict) {
//        if(j==n-1) {
//            Math.min(res+ area[n-1][])
//        }
        if(i==n) {
            res = Math.min(res, count);
            return;
        }

        for(int[] d: dict) {
            int x = i + d[0];
            int y = j + d[1];
            if(x==n-1) {
                res = Math.min(res, count + area[x][y]);
                return;
            }
            if(x==n) {
                res = Math.min(res, count);
                return;
            }
            if(x<0||x>n||y<0||y>=n || memory[x][y]) continue;
            memory[x][y] = true;
            dfs(n, x, y, area, memory, count+area[x][y], dict);
            memory[x][y] = false;
        }
    }
}
