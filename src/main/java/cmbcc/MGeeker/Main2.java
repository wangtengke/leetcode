package cmbcc.MGeeker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-21
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        // 第 t 时间 各个炉子的面包数量
        long[][] pre = new long[t+1][n];

        for (int i = 1; i < t+1; i++) {
            for (int j = 0; j < n; j++) {
                pre[i][j] = Math.min(arr[j][1], pre[i-1][j] + arr[j][0]);
            }
        }
        for (int i = 1; i < t+1; i++) {
            long[] cur = pre[i];
            Arrays.sort(cur);
            long sum = 0;
            for (int j = cur.length-1; j >= cur.length-1-k+1; j--) {
                sum += cur[j];
            }
            if(sum>=(long)l) {
                System.out.println("YES");
                System.out.println(i);
                break;
            }
            if(i==t && sum<(long)l) {
                System.out.println("NO");
                System.out.println(sum);
                break;
            }
        }


    }

}
