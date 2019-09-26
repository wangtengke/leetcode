package nowcoder2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 牛牛有一些排成一行的正方形。每个正方形已经被染成红色或者绿色。牛牛现在可以选择任意一个正方形然后用这两种颜色的任意一种进行染色,这个正方形的颜色将会被覆盖。牛牛的目标是在完成染色之后,每个红色R都比每个绿色G距离最左侧近。牛牛想知道他最少需要涂染几个正方形。
 * 如样例所示: s = RGRGR
 * 我们涂染之后变成RRRGG满足要求了,涂染的个数为2,没有比这个更好的涂染方案。
 * 输入描述:
 * 输入包括一个字符串s,字符串s长度length(1 ≤ length ≤ 50),其中只包括'R'或者'G',分别表示红色和绿色。
 * 输出描述:
 * 输出一个整数,表示牛牛最少需要涂染的正方形数量
 * 示例1
 * 输入
 * 复制
 * RGRGR
 * 输出
 * 复制
 * 2
 * @author: wangtengke
 * @create: 2019-04-16
 **/
public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = getresult(s);
        System.out.println(ans);
    }

    private static int getresult(String s) {
        char[] ss = s.toCharArray();
        char[] sb = s.toCharArray();
        Arrays.sort(ss);
        int count = 0;
        for (int i = 0; i <sb.length ; i++) {
            if(ss[i]==(sb[sb.length-i-1]))
                count++;
        }
        return s.length()-count;
    }

}
