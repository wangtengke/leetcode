package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 牛牛和羊羊非常无聊.他们有n + m个共同朋友,他们中有n个是无聊的,m个是不无聊的。每个小时牛牛和羊羊随机选择两个不同的朋友A和B.(如果存在多种可能的pair(A, B),任意一个被选到的概率相同。),然后牛牛会和朋友A进行交谈,羊羊会和朋友B进行交谈。在交谈之后,如果被选择的朋友之前不是无聊会变得无聊。现在你需要计算让所有朋友变得无聊所需要的时间的期望值。
 * 输入描述:
 * 输入包括两个整数n 和 m(1 ≤ n, m ≤ 50)
 * 输出描述:
 * 输出一个实数,表示需要时间的期望值,四舍五入保留一位小数。
 * 示例1
 * 输入
 * 复制
 * 2 1
 * 输出
 * 复制
 * 1.5
 * @author: wangtengke
 * @create: 2019-04-18
 **/
public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // boring
        int n = scanner.nextInt();
        // not boring
        int m = scanner.nextInt();

        float ans = getresult(n, m);
        System.out.println(ans);
    }

    private static float getresult(int n, int m) {
        int all = n + m;
        float down = 1;
        float up = 1;
        for (int i = 1; i <= m; i++) {
            down = down * i * (all-i);
            up = up * all * (all-1)/2;
        }
        return up/down;
    }
}
