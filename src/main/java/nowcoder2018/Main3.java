package nowcoder2018;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * 题目描述
 * 小易非常喜欢拥有以下性质的数列:
 * 1、数列的长度为n
 * 2、数列中的每个数都在1到k之间(包括1和k)
 * 3、对于位置相邻的两个数A和B(A在B前),都满足(A <= B)或(A mod B != 0)(满足其一即可)
 * 例如,当n = 4, k = 7
 * 那么{1,7,7,2},它的长度是4,所有数字也在1到7范围内,并且满足第三条性质,所以小易是喜欢这个数列的
 * 但是小易不喜欢{4,4,4,2}这个数列。小易给出n和k,希望你能帮他求出有多少个是他会喜欢的数列。
 * 输入描述:
 * 输入包括两个整数n和k(1 ≤ n ≤ 10, 1 ≤ k ≤ 10^5)
 * 输出描述:
 * 输出一个整数,即满足要求的数列个数,因为答案可能很大,输出对1,000,000,007取模的结果。
 * 示例1
 * 输入
 * 复制
 * 2 2
 * 输出
 * 复制
 * 3
 * @author: wangtengke
 * @create: 2019-04-16
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = getresult(n, k);
        System.out.println(ans);
    }

    private static int getresult(int n, int k) {
        int mod = 1000000007;
        int[][] dp = new int[11][100001];
        dp[0][1]= 1;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j=1; j<=k; j++) {
                sum = (sum + dp[i-1][j]) % mod;
            }
            for (int j = 1; j <= k; j++) {
//                sum = (sum + dp[i-1][j])%mod;
                int p =2;
                int invaid = 0;
                while ( p * j <=k){
                    invaid = (invaid + dp[i-1][p*j])%mod;
                    p++;
                }
                dp[i][j] = (sum - invaid+mod)%mod;
            }
        }
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum = (sum + dp[n][i])%mod;
        }
        return sum;

    }
}
