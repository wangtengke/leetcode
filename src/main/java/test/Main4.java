package test;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-18
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        int[][] dpa = new int[n][2];
        int[][] dpb = new int[n][2];
        for (int i = 0; i < n; i++) {
            if(i==0) {
                dpa[i][0] = 0;
                dpa[i][1] = 1;
                dpb[i][0] = 0;
                dpb[i][1] = arr[i][0];
            }
            else {
//                dpa[i][0] =
            }
        }
    }

}
