package hard;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-09
 **/
public class ValidPermutationsforDISequence {
    public int numPermsDISequence(String S) {
        int n = S.length();
        int mod = 1000000007;
        int[][] dp = new int[n+1][n+1];
        dp[0][0] = 1;
        // dp[0] = n;
        //length i   end with j
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i)=='D') {
                for(int j=0; j<=i; j++) {
                    for(int k=j; k<=i; k++){
                        dp[i+1][j] += dp[i][k];
                        dp[i+1][j] %= mod;
                    }

                }
            }
            else {
                for(int j=0; j<=i+1; j++) {
                    for(int k=0; k<j; k++){
                        dp[i+1][j] += dp[i][k];
                        dp[i+1][j] %= mod;
                    }
                }
            }
        }
        int sum = 0;
        for(int i=0; i<=n; i++) {
            System.out.println(dp[n][i]);
            sum += dp[n][i];
            sum %= mod;
        }
        return sum;
    }

    public static void main(String[] args) {
        ValidPermutationsforDISequence validPermutationsforDISequence = new ValidPermutationsforDISequence();
        validPermutationsforDISequence.numPermsDISequence("DID");
    }

}
