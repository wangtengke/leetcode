package interview;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-09
 **/
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int value = scanner.nextInt();
        int ans = getresult(money,value);
        System.out.println(ans);
    }

    private static int getresult(int money, int value) {
        int res = value/money +1;
        return res;
    }

}
