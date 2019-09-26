package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 牛牛得到一个长度为n的整数序列V,牛牛定义一段连续子序列的幸运值为这段子序列中最大值和次大值的异或值(次大值是严格的次大)。牛牛现在需要求出序列V的所有连续子序列中幸运值最大是多少。请你帮帮牛牛吧。
 * 输入描述:
 * 第一行一个整数n,即序列的长度。(2<= n <= 100000)
 * 第二行n个数，依次表示这个序列每个数值V[i], (1 ≤ V[i] ≤ 10^8)且保证V[1]到V[n]中至少存在不同的两个值.
 * 输出描述:
 * 输出一个整数,即最大的幸运值
 * 示例1
 * 输入
 * 复制
 * 5
 * 5 2 1 4 3
 * 输出
 * 复制
 * 7
 * @author: wangtengke
 * @create: 2019-04-18
 **/
public class Main20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        int ans = getresult(v, n);
        System.out.println(ans);
    }

    private static int getresult(int[] v, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = 0;
            for (int j = i-1; j >=0 ; j--) {
                if(v[i] < v[j]) {
                    left = v[j] ^ v[i];
                    break;
                }
            }
            for (int j = i+1; j < n; j++) {
                if(v[i]<v[j]) {
                    right = v[j] ^ v[i];
                    break;
                }
            }
            int max = Math.max(left,right);
            ans = Math.max(ans, max);
        }
        return ans;
    }

}
