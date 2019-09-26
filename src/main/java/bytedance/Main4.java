package bytedance;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-08
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            String ans = getresult(s);
            System.out.println(ans);
        }
    }

    private static String getresult(String s) {
        if(s.length()<3)
            return s;
        String cur = "";
        for (int i = 0; i < s.length()-2; i++) {
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)) continue;
            cur =  cur + s.charAt(i);
        }
        cur = cur + s.charAt(s.length()-1);
        String ss = "";
        if(cur.length()<4)
            return cur;
        for (int i = 2; i < cur.length()-1; i++) {
            if(cur.charAt(i)==cur.charAt(i+1)&& cur.charAt(i-2)==cur.charAt(i-1)) continue;
            ss = ss + cur.charAt(i);
        }
        ss = ss + cur.charAt(cur.length()-1);
        return  ss;
    }

}
