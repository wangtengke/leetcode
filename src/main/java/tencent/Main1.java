package tencent;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-05
 **/
public class Main1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int num = scanner.nextInt();
//        int[] coins = new int[num];
//        for (int i = 0; i < num; i++) {
//            coins[i] = scanner.nextInt();
//        }
//        int ret = getresult(n,coins);
//        System.out.println(ret);
//    }
//
//    private static int getresult(int n, int[] coins) {
//        int index = 0;
//        int inx = 0;
//        int ret = 0;
//        if (coins[0] != 1)
//            return -1;
//        for (int i = 0; i < n; i++) {
//            if (inx == coins.length) {
//                n = n - coins[coins.length - 1];
//                i = 0;
//                inx = 0;
//                continue;
//            }
//            if (i == coins[inx]) {
//                ret = Math.max(ret, index);
//                index = index - coins[inx] + 1;
//                inx++;
//            } else {
//                index++;
//            }
//        }
//    }
}
