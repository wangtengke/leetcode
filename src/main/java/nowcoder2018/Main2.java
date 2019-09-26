package nowcoder2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 小易老师是非常严厉的,它会要求所有学生在进入教室前都排成一列,并且他要求学生按照身高不递减的顺序排列。有一次,n个学生在列队的时候,小易老师正好去卫生间了。学生们终于有机会反击了,于是学生们决定来一次疯狂的队列,他们定义一个队列的疯狂值为每对相邻排列学生身高差的绝对值总和。由于按照身高顺序排列的队列的疯狂值是最小的,他们当然决定按照疯狂值最大的顺序来进行列队。现在给出n个学生的身高,请计算出这些学生列队的最大可能的疯狂值。小易老师回来一定会气得半死。
 * 输入描述:
 * 输入包括两行,第一行一个整数n(1 ≤ n ≤ 50),表示学生的人数
 * 第二行为n个整数h[i](1 ≤ h[i] ≤ 1000),表示每个学生的身高
 * 输出描述:
 * 输出一个整数,表示n个学生列队可以获得的最大的疯狂值。
 *
 * 如样例所示:
 * 当队列排列顺序是: 25-10-40-5-25, 身高差绝对值的总和为15+30+35+20=100。
 * 这是最大的疯狂值了。
 * 示例1
 * 输入
 * 复制
 * 5
 * 5 10 25 40 25
 * 输出
 * 复制
 * 100
 * @author: wangtengke
 * @create: 2019-04-16
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }
        int ans = getresult(height,n);
        System.out.println(ans);
    }

    private static int getresult(int[] height, int n) {
        Arrays.sort(height);
        int mid = height[n-1];
        int begin = 0;
        int end = n-2;
        int left = mid;
        int right = mid;
        int ret = 0;
        while (end > begin){
            if(end - begin == 2){
                ret += Math.abs(left-height[begin]);
                left = height[begin++];
                ret += Math.abs(right-height[begin]);
                right = height[begin++];
                ret += Math.max(Math.abs(height[end]-left),Math.abs(height[end]-right));
                break;
            }
            else if(end - begin == 1){
                ret += Math.abs(left-height[begin]);
                left = height[begin++];
                ret += Math.abs(right-height[begin]);
                right = height[begin++];
                break;
            }
            else if(end - begin ==0){
                ret += Math.max(Math.abs(height[begin]-left),Math.abs(height[begin]-right));
                break;
            }
            else {
                ret += Math.abs(left - height[begin]);
                left = height[begin++];
                ret += Math.abs(right - height[begin]);
                right = height[begin++];

                ret += Math.abs(left - height[end]);
                left = height[end--];

                ret += Math.abs(right - height[end]);
                right = height[end--];
            }
        }
        return ret;
    }

}
