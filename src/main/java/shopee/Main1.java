package shopee;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-14
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ch = s.toCharArray();
        int n = ch.length;
        int max = -1;
        int pre_index = -1;
        int now_index = -1;
        for(int i=n-1; i>=0; i--) {
            if(ch[i]-'0'>max) {
                for(int j=i+1; j<n; j++) {
                    if(ch[j]<ch[i]) {
                        pre_index = j;
                        now_index = i;
                        break;
                    }
                }
                break;
            }
            else {
                max = Math.max(max, ch[i]-'0');
            }
        }
        if(pre_index==-1) System.out.println("0");
        else {
            char tem = ch[pre_index];
            ch[pre_index] = ch[now_index];
            ch[now_index] = tem;
            if(ch[0]=='0') System.out.println("0");
            else System.out.println(new String(ch));
        }

    }

}
