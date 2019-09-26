package huawei;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-31
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cur = "";
        String[][] str  = new String[3][2];
        for (int k = 0; k < 3; k++) {
            str[k][0] = scanner.next();
            str[k][1] = scanner.next();
        }
        for (int k = 0; k < 3; k++) {
            String src = str[k][0];
            String tar = str[k][1];
            String s = src.concat(src);
            if(s.contains(tar)) cur+="1";
            else  cur+="0";


        }
        System.out.println(cur);


    }

}
