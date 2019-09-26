package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 牛牛和羊羊都很喜欢青草。今天他们决定玩青草游戏。
 * 最初有一个装有n份青草的箱子,牛牛和羊羊依次进行,牛牛先开始。在每个回合中,每个玩家必须吃一些箱子中的青草,所吃的青草份数必须是4的x次幂,比如1,4,16,64等等。不能在箱子中吃到有效份数青草的玩家落败。假定牛牛和羊羊都是按照最佳方法进行游戏,请输出胜利者的名字。
 * 输入描述:
 * 输入包括t+1行。
 * 第一行包括一个整数t(1 ≤ t ≤ 100),表示情况数.
 * 接下来t行每行一个n(1 ≤ n ≤ 10^9),表示青草份数
 * 输出描述:
 * 对于每一个n,如果牛牛胜利输出"niu",如果羊羊胜利输出"yang"。
 * 示例1
 * 输入
 * 复制
 * 3
 * 1
 * 2
 * 3
 * 输出
 * 复制
 * niu
 * yang
 * niu
 * @author: wangtengke
 * @create: 2019-04-18
 **/
public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] N = new int[n];
        for (int i = 0; i < n; i++) {
            N[i] = scanner.nextInt();
            String ans =  getresult(N[i]);
            System.out.println(ans);
        }
//        int ans = getresult(N, n);
    }

    private static String getresult(int a) {
        if (a % 5 == 1 || a % 5 == 3 || a % 5 == 4)
            return "niu";
        else
            return "yang";
    }
}
