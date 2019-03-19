package bytedance;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-16
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            String s = scanner.next();
            String ans = getresult(s);
            System.out.println(ans);
        }
    }

    private static String getresult(String s) {
        char[] chars = s.toCharArray();
        int index = 0;
        int len = s.length();
        while (index<len-2){
            if(s.substring(index,index+1)==s.substring(index+1,index+2)){
                if(s.substring(index+1,index+2)==s.substring(index+2,index+3)){
                    s= s.substring(0,index+2).concat(s.substring(index+3,len));
                }
            }
        }
        return s;
    }

}
