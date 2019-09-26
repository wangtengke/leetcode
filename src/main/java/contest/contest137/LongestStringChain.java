package contest.contest137;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-19
 **/
public class LongestStringChain {
    int max = 0;
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int n = words.length;
        int[] dp = new int[n];
        dp[0]=1;
        for(int i=1; i<n; i++){
            dp[i]=1;
            for(int j=0; j<i; j++){
                if(words[i].length()-words[j].length()==1){
                    for(int k=0; k<words[i].length(); k++){
                        String s;
                        if(k==words[i].length()-1)  s = words[i].substring(0,k);
                        else  s = words[i].substring(0,k)+words[i].substring(k+1);
                        if(s.equals(words[j])){
                            dp[i] = Math.max(dp[i], dp[j]+1);
                        }
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;

    }

    public static void main(String[] args) {
        LongestStringChain longestStringChain = new LongestStringChain();
        longestStringChain.longestStrChain(new String[]{"ksqvsyq","ks","kss","czvh","zczpzvdhx","zczpzvh","zczpzvhx","zcpzvh","zczvh","gr","grukmj","ksqvsq","gruj","kssq","ksqsq","grukk"});
    }

}
