package AtCoder.contest129;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-16
 **/
public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = solve(arr, n, k);
        System.out.println(res);
    }

    private static int solve(int[] arr, int n, int k) {
        int count = 0;
        long[] presum = new long[n];
        presum[0] = arr[0];
        for (int i = 1; i <n ; i++) {
            presum[i] = presum[i-1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j>=i; j--) {
                if(i==0) {
                    if(presum[j]>=k) count++;
                }
                else {
                    long sub = presum[j] - presum[i - 1];
//                    System.out.println(sub);
                    if (sub >= k) count++;
                    else break;
                }
            }
        }
        return count;
    }

}
