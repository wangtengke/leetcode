package nowcoder2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-14
 **/
public class Main23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        String res = solve(a);
        System.out.println(res);
    }

    private static String solve(int[] a) {
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <a.length-1; i++) {
            boolean flag = true;
            for(int j = i+1; j<a.length; j++){
                if(a[j]%a[i]==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                if (sb.length() == 0) sb.append(a[i]);
                else {
                    sb.append(" ");
                    sb.append(a[i]);
                }
            }
        }
        if(sb.length()!=0) sb.append(" ");
        sb.append(a[a.length-1]);
        return new String(sb);
    }

}
