package interview;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-09
 **/
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] N  = new int[n][2];
        for (int i = 0; i <N.length ; i++) {
            N[i][0]= scanner.nextInt();
            N[i][1]= scanner.nextInt();
        }

    getSum(N);
    }

    private static void getSum(int[][] n) {
        for (int i = 0; i <n.length ; i++) {
            int begin = n[i][0];
            int end = n[i][1];
            int sum = 0;
            if(begin%2==1&&end%2==1){
                sum = (end-begin)/2-end;
            }
            else if(begin%2==1&&end%2==0){
                sum = (end-begin+1)/2;
            }
            else if(begin%2==0&&end%2==1){
                sum = -(end-begin+1)/2;
            }
            else {
                sum = -(end-begin)/2+end;
            }
            System.out.println(sum);
        }
    }

}
