package codeforces;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-12
 **/
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = solve(n);
        System.out.println(res);
    }

    private static int solve(int n) {
        if(n%2 == 1) return 0;
        else{
            return (int) Math.pow(2, n/2);
        }
    }

}
