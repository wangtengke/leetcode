package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 如果一个整数只能被1和自己整除,就称这个数是素数。
 * 如果一个数正着反着都是一样,就称为这个数是回文数。例如:6, 66, 606, 6666
 * 如果一个数字既是素数也是回文数,就称这个数是回文素数
 * 牛牛现在给定一个区间[L, R],希望你能求出在这个区间内有多少个回文素数。
 * 输入描述:
 * 输入包括一行,一行中有两个整数(1 ≤ L ≤ R ≤ 1000)
 * 输出描述:
 * 输出一个整数,表示区间内回文素数个数。
 * 示例1
 * 输入
 * 复制
 * 100 150
 * 输出
 * 复制
 * 2
 * @author: wangtengke
 * @create: 2019-04-16
 **/
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        int ans = getresult(begin, end);
        System.out.println(ans);
    }

    private static int getresult(int begin, int end) {
        int ans = 0;
        for (int i = begin; i <= end ; i++) {
            if(begin==2) {
                ans++;
                continue;
            }
            StringBuffer sb = new StringBuffer(String.valueOf(i));
            String sbr = sb.toString();
            sb.reverse();
            if(sbr.equals(sb.toString())){
                int flag = 0;
                for (int j = 2; j <i ; j++) {
                    if(i%j==0) {
                        flag = 1;
                        break;
                    }
                }
                if(flag==0)
                    ans++;
            }
        }
        return ans;
    }
}
