package nowcoder2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-14
 **/
public class Main25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = scanner.nextInt();
        }
        int res = solve(a);
        System.out.println(res);
    }

    private static int solve(int[] a) {
        Arrays.sort(a);
        int index = 0;
        long sum = a[index++];
        int c = 0;
        int mod = 1000000007;
        while(index < a.length){
            c++;
            sum = (sum * (a[index]-c)) % mod;
            index++;
        }
        return (int)sum;
    }

}
