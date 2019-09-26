package ebay;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-25
 **/
public class Main {
    public static boolean flag = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cur = scanner.nextLine();
        String res = "";
        char[] ch = cur.toCharArray();
        for(int i=1; i<=cur.length(); i++) {
            dfs(ch, i, i);
            if(flag) {
                for(int j=1; j<=cur.length(); j++) {
                    if(j%i==0) res += "1";
                    else res += "0";
                }
                break;
            }
        }
        System.out.println(res);

    }

    private static void dfs(char[] ch,  int len, int need) {
        if(ch.length==len) {
            flag = true;
            return;
        }
        if(ch.length-len<need) return;
        for(int i=len ;i<len + need; i++) {
            if(i>=ch.length || i<0 || i-need>= ch.length || i-need<0) return;
            if(ch[i]!=ch[i-need]) return;
        }

        dfs(ch, len + need, need);

    }

}
