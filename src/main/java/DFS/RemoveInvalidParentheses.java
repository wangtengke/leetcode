package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-27
 **/
public class RemoveInvalidParentheses {
    public String cur = "";
    public List<String> list = new ArrayList<>();
    public int min = 10000;
    public List<String> removeInvalidParentheses(String s) {
        int size = s.length();
        int left = 0;
        int right = 0;
        int l = 0;
        int r = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(')
                left++;
            if(s.charAt(i)==')')
                right++;
            if(right>left){
                r++;
                left = 0;
                right = 0;
            }
        }
        l = left - right;

        dfs(s, 0, l, r, list);
        return list;
    }

    public void dfs(String s, int index, int l, int r, List<String> list){
        if(l==0 && r==0 && valid(s)){
            list.add(s);
            return;
        }
        if(r > 0){
            for(int i=index; i<s.length(); i++){
                if(i>index && s.charAt(i)==s.charAt(i-1)) continue;
                if(s.charAt(i)==')'){
                    dfs(s.substring(0,i)+s.substring(i+1,s.length()), i, l, r-1, list);
                }
            }
        }
        if(l > 0){
            for(int i=index; i<s.length(); i++){
                if(i>index && s.charAt(i)==s.charAt(i-1)) continue;
                if(s.charAt(i)=='('){
                    dfs(s.substring(0,i)+s.substring(i+1,s.length()), i, l-1, r, list);
                }
            }
        }

    }

    public boolean valid(String s){
        int left = 0;
        int right = 0;
        int l = 0;
        int r = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(')
                left++;
            if(s.charAt(i)==')')
                right++;
            if(right>left){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        RemoveInvalidParentheses  removeInvalidParentheses = new RemoveInvalidParentheses();
        removeInvalidParentheses.removeInvalidParentheses(")(");
    }

}
