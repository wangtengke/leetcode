package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-14
 **/
public class Main24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int w = scanner.nextInt();
        System.out.println(l >= r + w? "OK": "DEADLOCK");
    }

}
