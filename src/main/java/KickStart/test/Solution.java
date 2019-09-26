package KickStart.test;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-15
 **/
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            solve(scanner, a+1, b);
        }
    }

    private static void solve(Scanner scanner, int a, int b) {
        int mid = (a+b)/2;
        System.out.println(mid);
        String s = scanner.nextLine();
        if(s.equals("CORRECT"))
            return;
        else if(s.equals("TOO_SMALL")){
            solve(scanner, mid+1, b);
        }
        else if(s.equals("TOO_BIG")){
            solve(scanner, a, mid-1);
        }
        else return;
    }

}
