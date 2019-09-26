package bytedance;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-08
 **/
public class Main5 {
    public static int res = 0;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = scanner.nextInt();
        }
        int ans = getresult(n, d, pos);
        System.out.println(ans);
    }

    private static int getresult(int n, int d, int[] pos) {
        Arrays.sort(pos);
        for (int i = 0; i < n-2; i++) {
            for (int j = i+2; j < n; j++) {
                if(pos[j] - pos[i]>d) {
//                    res ++;
                    break;
                }
                res+= (j-i)-1;
            }
        }
        return res;
    }

}
