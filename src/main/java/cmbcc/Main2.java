package cmbcc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-17
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n ; i++) {
            h[i]=scanner.nextInt();
        }
        int ans = getresult(k,h);
        System.out.println(ans);
    }

    private static int getresult(int k, int[] h) {
        int len = h.length;
        if(len==1)
            return 0;
        Arrays.sort(h);
        int min = h[0];
        int max = h[len-1];
        int count = 0;
        while (max>=min){
            int begin = max;
            int ans = 0;
            for (int i = 0; i <len ; i++) {
                if(h[i]>max){
                    ans += h[i]-max;
                }
            }
            if(ans>k) {
                max++;
                for (int i = 0; i <len ; i++) {
                    if(h[i]>max){
                        h[i]=max;
                    }
                }
                count ++;
                continue;
            }
            if(max==min){
                count++;
            }
            max--;
        }
        return count;
    }

}
