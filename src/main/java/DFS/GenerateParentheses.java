package DFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-26
 **/
public class GenerateParentheses {
    public String cur = "";
    public List<String> res = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        String s = "";
        for(int i=0; i<n; i++){
            s = s + "()";
        }
        boolean[] usd = new boolean[s.length()];
        dfs(s, 0, cur, res, usd);
        return res;
    }

    public void dfs(String s, int index, String cur, List<String> list, boolean[] usd){
        if(cur.length()==s.length()){
            list.add(cur);
            return;
        }
        for(int i=0; i<s.length(); i++){
            if(usd[i]) continue;
            cur = cur + s.charAt(i);
            usd[i] = true;
            dfs(s, i+1, cur, list, usd);
            cur = cur.substring(0, cur.length()-1);
            usd[i] = false;
        }
    }

    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        generateParentheses.generateParenthesis(3);
    }

}
