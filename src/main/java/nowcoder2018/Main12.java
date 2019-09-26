package nowcoder2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 牛牛有4根木棍,长度分别为a,b,c,d。羊羊家提供改变木棍长度的服务,如果牛牛支付一个硬币就可以让一根木棍的长度加一或者减一。牛牛需要用这四根木棍拼凑一个正方形出来,牛牛最少需要支付多少硬币才能让这四根木棍拼凑出正方形。
 * 输入描述:
 * 输入包括一行,四个整数a,b,c,d(1 ≤ a,b,c,d ≤ 10^6), 以空格分割
 * 输出描述:
 * 输出一个整数,表示牛牛最少需要支付的硬币
 * 示例1
 * 输入
 * 复制
 * 4 1 5 4
 * 输出
 * 复制
 * 4
 * @author: wangtengke
 * @create: 2019-04-16
 **/
public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] reg = new int[4];
        for (int i = 0; i <4 ; i++) {
            reg[i] = scanner.nextInt();
        }
        int ans = getresult(reg);
        System.out.println(ans);
    }

    private static int getresult(int[] reg) {
        Arrays.sort(reg);
        int ret = 0;
        if(reg[0]==reg[1]){
            ret += Math.abs(reg[2]-reg[1]);
            ret += Math.abs(reg[3]-reg[1]);
            return ret;
        }
        else {
            ret += Math.abs(reg[2]-reg[1]);
            ret += Math.abs(reg[2]-reg[0]);
            ret += Math.abs(reg[2]-reg[3]);
            return ret;
        }
    }

}
