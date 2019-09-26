package cmbcc.MGeeker;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-21
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
//        int maxSum = Integer.MAX_VALUE;
//        int curMaxSum = 0;
//        int all = 0;
        long max = -1000000000;
        long min = 1000000000;
        long summax = 0;
        long summin = 0;
        long total = 0;
        for(int i: arr) {
            total += i;
            summax += i;
            summax = Math.max(summax, i);
            max = Math.max(max, summax);
            summin += i;
            summin = Math.min(summin, i);
            min = Math.min(min, summin);
        }
        // System.out.println(min + "  " + max);
        System.out.print(max>0? Math.max(total - min, max): max);
    }

}
