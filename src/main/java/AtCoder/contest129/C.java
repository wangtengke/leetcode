package AtCoder.contest129;



import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-16
 **/
public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] L = new int[n];
        for(int i=0; i<n; i++){
            L[i] = scanner.nextInt();
        }
        int res = solve(L, n, x);
        System.out.println(res);
    }

    private static int solve(int[] l, int n, int x) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(sum + l[i]>x) break;
            sum += l[i];
            count++;

        }
        return count;
    }

}
