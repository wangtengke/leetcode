package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 * 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
 * 输入描述:
 * 输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
 * 输出描述:
 * 如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
 * 示例1
 * 输入
 * 复制
 * 1010 3 101010 2
 * 输出
 * 复制
 * Equal
 * @author: wangtengke
 * @create: 2019-04-16
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int k2 = scanner.nextInt();
        String ans = getresult(x1, k1, x2, k2);
        System.out.println(ans);
    }

    private static String getresult(int x1, int k1, int x2, int k2) {
        String a = "";
        String b = "";
        for (int i = 0; i < k1; i++) {
            a = a.concat(String.valueOf(x1));
        }
        for (int i = 0; i < k2; i++) {
            b = b.concat(String.valueOf(x2));
        }
        if(a.length()<b.length())
            return "Less";
        else if(a.length()>b.length())
            return "Greater";
        else {
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i)>b.charAt(i))
                    return "Greater";
                if(a.charAt(i)<b.charAt(i))
                    return "Less";
            }
            return "Equal";
        }
    }

}
