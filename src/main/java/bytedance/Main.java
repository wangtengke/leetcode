package bytedance;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-16
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int ans = getresult(N);
        System.out.println(ans);
    }

    private static int getresult(int n) {
        int leave = 1024 -n;
        int ans = 0;
        ans += leave/64;
        leave = leave%64;
        ans += leave/16;
        leave = leave%16;
        ans += leave/4;
        leave = leave%4;
        ans += leave;
        return ans;
    }
}
