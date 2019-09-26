package nowcoder2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-19
 **/
public class Main26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        int res = solve(s, arr);
        System.out.println(res);
    }

    private static int solve(int s, int[][] arr) {
        Arrays.sort(arr, (a, b)-> b[0]+b[1] - (a[0]+a[1]));
        int begin = 0;
        int end = arr.length-1;
        int count = 0;
        while(end > begin) {
            if(Math.min(arr[end][0],arr[begin][0]) + arr[begin][1]>=s) {
                count++;
                begin++;
                end--;
            }
            else end--;
        }
        return count;
    }

}
