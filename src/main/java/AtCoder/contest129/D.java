package AtCoder.contest129;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-16
 **/
public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long w = scanner.nextInt();
        long h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print((double)(h*w)/2 + " ");
        if(w==2*x && h==2*y) {
            System.out.println("1");
        }
        else System.out.println("0");
    }

}
