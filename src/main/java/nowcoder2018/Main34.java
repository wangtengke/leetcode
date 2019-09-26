package nowcoder2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-08
 **/
public class Main34 {
    static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        dfs(0, s, "");
        for(String ss: res) System.out.println(ss);
    }

    private static void dfs(int index, String s, String cur) {
//        cur += s.charAt(index);
        if(index>=s.length()) {
            res.add(cur);
            return;
        }
        if(Integer.valueOf(s.substring(index, index + 1))==0) return;
        dfs(index + 1, s, cur + (char)(Integer.valueOf(s.substring(index, index +1))-1+'A'));
        if(index + 1< s.length() && Integer.valueOf(s.substring(index, index + 2))<=26) {
            dfs(index + 2, s, cur + (char)(Integer.valueOf(s.substring(index, index + 2))-1 + 'A'));
        }
    }

}
