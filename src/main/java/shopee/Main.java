package shopee;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-14
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res = "";
        for(int i=0; i<s.length(); i++) {
            if(i==0) {
                if(!((s.charAt(i)<='Z' && s.charAt(i)>='A') || (s.charAt(i)<='z' && s.charAt(i)>='a') || (s.charAt(i)>='0' && s.charAt(i)<='9'))) continue;
                if(s.charAt(i)<='Z' && s.charAt(i)>='A') {
                    String temp = String.valueOf(s.charAt(i));
                    temp = temp.toLowerCase();
                    res += temp;
                }
                else res += s.charAt(i);
            }
            if(i>0) {
                if(!((s.charAt(i)<='Z' && s.charAt(i)>='A') || (s.charAt(i)<='z' && s.charAt(i)>='a') || (s.charAt(i)>='0' && s.charAt(i)<='9'))) continue;
                if((s.charAt(i-1)<='Z' && s.charAt(i-1)>='A') || (s.charAt(i-1)<='z' && s.charAt(i-1)>='a') || (s.charAt(i-1)>='0' && s.charAt(i-1)<='9')) {
                    if((s.charAt(i-1)<='Z' && s.charAt(i-1)>='A') ||  (s.charAt(i-1)<='z' && s.charAt(i-1)>='a')) {
                        String temp = String.valueOf(s.charAt(i));
                        temp = temp.toLowerCase();
                        res += temp;
                    }
                    else {
                        res += s.charAt(i);
                    }
                }
                else {
                    String temp = String.valueOf(s.charAt(i));
                    temp = temp.toUpperCase();
                    res += temp;
                }
            }
        }
        if(res.charAt(0)>='A' && res.charAt(0)<='Z') {
            String temp = String.valueOf(res.charAt(0)).toLowerCase();
            res  = temp + res.substring(1);
        }
        System.out.println(res);
    }
}
