package contest.contest131;

import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-07
 **/
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        String[] s = S.split("");
        String ret = "";
        int[] arr = new int[1000];
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if(stack.isEmpty()){
                stack.push(s[i]);
            }
            else if(!stack.peek().equals(s[i])){
                stack.pop();
                if(!stack.isEmpty()){
                    ret = ret.concat(s[i]);
                }
            }
            else {
                stack.push(s[i]);
                ret = ret.concat(s[i]);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();
        removeOutermostParentheses.removeOuterParentheses("(()())(())");
    }
}
