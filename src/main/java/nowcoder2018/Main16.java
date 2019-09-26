package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-18
 **/
public class Main16 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int ans = getresult(a, b, c);
            System.out.println(ans);
        }

        public static int getresult(int a, int b, int c){
            if(a+b<=c){
                return 2*(a+b)-1;
            }

            else if(a+c<=b){
                return 2*(a+c)-1;
            }

            else if(b+c<=a){
                return 2*(b+c)-1;
            }

            else
                return a+b+c;
        }

}
