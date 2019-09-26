package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值
 * 例如: 字符串"abacaba",里面包括4个'a',2个'b',1个'c',于是这个字符串的价值为4 * 4 + 2 * 2 + 1 * 1 = 21
 * 牛牛有一个字符串s,并且允许你从s中移除最多k个字符,你的目标是让得到的字符串的价值最小。
 * 输入描述:
 * 输入包括两行,第一行一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),其中只包含小写字母('a'-'z')。
 * 第二行包含一个整数k(0 ≤ k ≤ length),即允许移除的字符个数。
 * 输出描述:
 * 输出一个整数,表示得到的最小价值
 * 示例1
 * 输入
 * 复制
 * aba
 * 1
 * 输出
 * 复制
 * 2
 * @author: wangtengke
 * @create: 2019-04-16
 **/
public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        int ans = getresult(s, k);
        System.out.println(ans);
    }

    private static int getresult(String s, int k) {
        int[] arr = new int[26];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
            max = Math.max(max, arr[s.charAt(i)-'a']);
        }
        while (k>0&&max>0){
            for (int i = 0; i < 26; i++) {
                if(arr[i]==max){
                    arr[i]--;
                    k--;
                    if(k==0)
                        break;
                }
            }
            max --;
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += Math.pow(arr[i],2);
        }
        return sum;
    }

}
