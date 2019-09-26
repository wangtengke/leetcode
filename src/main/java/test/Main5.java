package test;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-18
 **/
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        int index = 1;
        int start = k;
        while(k<=b){
            if(k<a && k<=start * start) {
                index++;
                k += k;
            }
            else if(k>a && k<=start * start) {
                k +=k;
                count++;
            }
            else if(k>start*start) {
                k +=k;
                count++;
            }
        }
        System.out.println(count);


    }

}
