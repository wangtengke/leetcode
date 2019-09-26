package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-21
 **/
public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] envelopes = new int [n][2];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            envelopes[i][0]=Math.min(a, b);
            envelopes[i][1]=Math.max(a, b);
        }
        int mod = 1000000007;
        Arrays.sort(envelopes, new Comparator<int[]>(){
            public int compare(int[] arr1, int[] arr2){
                if(arr1[0] == arr2[0])
                    return arr2[1] - arr1[1];
                else
                    return arr1[0] - arr2[0];
            }
        });
        int dp[] = new int[envelopes.length];
        int len = 0;
        for(int[] envelope : envelopes){
            int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
            if(index < 0)
                index = -(index + 1);
            dp[index] = envelope[1];
            if(index == len)
                len++;
        }

    }
}
