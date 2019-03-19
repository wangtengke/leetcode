package cmbcc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-17
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i <n ; i++) {
            ints[i]=scanner.nextInt();
        }
        int ans = getresult(ints);
        System.out.println(ans);
    }

    private static int getresult(int[] n) {
        int len = n.length;
        int sum = 0;
        int count =0;
        for (int i = 0; i < len; i++) {
            if(n[i]<0)
                count++;
            sum+=Math.abs(n[i]);
        }
        Arrays.sort(n);
        sum = sum - n[0]-n[0];
        return sum;
    }

}
