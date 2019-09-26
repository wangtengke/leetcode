package vmware;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-08
 **/
public class Main1 {
    public static double res;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// red
        int m = scanner.nextInt();// blue;
        res = 0;
        int who = 0;
        double temp = 1.0;
        int[] get = {0,1};
        dfs(n, m, who, temp, get);
        System.out.println(Math.round(res*100000)/100000.0);

    }

    private static void dfs(int n, int m, int who, double temp, int[] get) {
        if(n==0) return;
        for(int g: get) {
            if(g==0) {
                if(who==0) {
                    res += temp* n * 1.0 /(m + n);
                    temp = 1;
                    return;
                }
                else if(who==1) {
                    temp = 1;
                    return;
                }
                else if(who==2) {
                    temp = temp *n *1.0/(m + n);
                    dfs(n-1, m, (who+1)% 3, temp, get);
                }
            }
            else {

                if(who==0) {
                    if(m==0) {
                        res += temp;
                        temp = 1;
                        return;
                    }
                    temp = temp* m * 1.0 /(m + n);
                    dfs(n, m-1, (who+1)%3, temp, get);
                }
                else if(who==1) {
                    if(m==0) {
                        temp = 1;
                        return;
                    }
                    temp = temp * m * 1.0/ (m + n);
                    dfs(n, m-1, (who+1)%3, temp, get);
                }
                else if(who==2) {
                    if(m==0 && n>1) {
                        res += temp;
                        temp = 1;
                        return;
                    }
                    else if(m==0 && n<=1) {
                        temp = 1;
                        return;
                    }
                    temp = temp * m * 1.0/ (m + n);
                    dfs(n, m-1, (who+1)%3, temp, get);
                }
            }
        }
    }

}
