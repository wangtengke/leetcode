package nowcoder2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 牛牛举办了一场数字游戏,有n个玩家参加这个游戏,游戏开始每个玩家选定一个数,然后将这个数写在纸上(十进制数,无前缀零),然后接下来对于每一个数字将其数位按照非递减顺序排列,得到新的数,新数的前缀零将被忽略。得到最大数字的玩家赢得这个游戏。
 * 输入描述:
 * 输入包括两行,第一行包括一个整数n(1 ≤ n ≤ 50),即玩家的人数
 * 第二行n个整数x[i](0 ≤ x[i] ≤ 100000),即每个玩家写下的整数。
 * 输出描述:
 * 输出一个整数,表示赢得游戏的那个玩家获得的最大数字是多少。
 * 示例1
 * 输入
 * 复制
 * 3
 * 9638 8210 331
 * 输出
 * 复制
 * 3689
 * @author: wangtengke
 * @create: 2019-04-16
 **/
public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = getresult(arr);
        System.out.println(ans);
    }

    private static int getresult(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] ss = String.valueOf(arr[i]).split("");
            Arrays.sort(ss, (a,b)->Integer.valueOf(a)-Integer.valueOf(b));
            String s ="";
            for(String ii : ss){
                s = s .concat(ii);
            }
            ans = Math.max(ans, Integer.valueOf(s));
        }
        return ans;
    }

}
