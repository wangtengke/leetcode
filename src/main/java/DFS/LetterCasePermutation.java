package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-20
 **/
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        String cur = "";
        int n = S.length();
        dfs(n, 0, S, cur, res);
        return res;
    }

    public void dfs(int n , int index, String s, String cur, List<String> res){
        if(n==cur.length()){
            res.add(new String(cur));
            return;
        }
        if(s.charAt(index)>='0' && s.charAt(index)<='9'){
            cur = cur + s.charAt(index);
            dfs(n, index+1, s ,cur, res);
        }
        else if(s.charAt(index)>='a' && s.charAt(index)<='z'){
            String low = cur + s.charAt(index);
            dfs(n, index+1, s ,low, res);
            String up = cur + (char)(32+s.charAt(index));
            dfs(n, index+1, s ,up, res);
        }
        else{
            String low = cur + s.charAt(index);
            dfs(n, index+1, s ,low, res);
            String up = cur + (char)(s.charAt(index)-32);
            dfs(n, index+1, s ,up, res);
        }

    }

    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        letterCasePermutation.letterCasePermutation("a1b2");
    }

}
