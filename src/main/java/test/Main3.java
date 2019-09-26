package test;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-18
 **/
public class Main3 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
           int m = scanner.nextInt();
           int k = scanner.nextInt();
            k = k -1;
            String now = "";
            if(m<2) {
                now +="0";
            }
            else {
                for(int j = 0; j<m; j++) {
                    if(j==0 || j==m-1) now += "1";
                    else  now +="0";
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(k));
            String cur = "";
            if(m%2==0) {
                cur = sb.toString() + sb.reverse().toString();
            }

            else  {
                if(sb.length()>2)
                    cur = sb.toString() + sb.reverse().toString().substring(1);
                else cur = sb.toString();
            }
            String res = "";
            for (int j = 0; j < now.length(); j++) {
                if(j<m/2-(cur.length())/2 || j>=m/2 + (cur.length()+1)/2) res += now.charAt(j);
                else {
                    res += String.valueOf(now.charAt(j)-'0'+ cur.charAt(j-(m/2-(cur.length())/2))-'0');
                }
            }
            System.out.println(res);


        }
    }
}
