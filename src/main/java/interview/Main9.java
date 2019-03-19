package interview;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-09
 **/
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int score = scanner.nextInt();
        int[] N = new int[n];
        for (int i = 0; i <n ; i++) {
            N[i] = scanner.nextInt();
        }
        int ans = getresult(n,score);
        System.out.println(ans);
    }

    private static int getresult(int n, int score) {
        if(score==0){
            int res = 1;
            for (int i = 0; i <n ; i++) {
                res = res*2;
            }
            return res;
        }
        int leave = n - score;
        int up = 1;
        for (int i = 1; i <=n ; i++) {
            up = up*i;
        }
        int down = 1;
        for (int i = 1; i <= score ; i++) {
            down = down*i;
        }
        for (int i = 1; i <=leave ; i++) {
            down = down*i;
        }
        int res = up/down;
        for (int i = 0; i <leave ; i++) {
            res = res*2;
        }
        return res;
    }

}
