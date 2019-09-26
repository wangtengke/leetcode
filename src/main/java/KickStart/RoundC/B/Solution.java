package KickStart.RoundC.B;

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
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] map = new int[m][n];
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    map[j][l] = scanner.nextInt();
                }
            }
            int res = solve(map, k);
            System.out.println("Case #"+String.valueOf(i+1)+": "+String.valueOf(res));
        }
    }

    private static int solve(int[][] map, int k) {
        int m = map.length;
        int n = map[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            int count =1;
            res[i][0] = count;
            for (int j = 0; j < n-1; j++) {
                if(Math.abs(map[i][j]-map[i][j+1])<=k){
                    while(Math.abs(map[i][j]-map[i][j+1])<=k){
                        count++;
                        j++;
                    }
                    for (int l = count; l >=1 ; l--) {
                        res[i][j-l+1] = l;
                    }
                    count=1;
                }
                else {
                    count = 1;
                    res[i][j+1] = count;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = 0;
                for (int l = i; l < m; l++) {
                    if(res[l][j]>0) {
                        min = Math.min(res[l][j], min);
                        index++;
                    }

                    else{
                        if(min==Integer.MAX_VALUE) break;
                        max = Math.max(min * index, max);
                        min = Integer.MAX_VALUE;
                        index = 0;
                    }

                }

            }
        }
        return max;
    }

}
