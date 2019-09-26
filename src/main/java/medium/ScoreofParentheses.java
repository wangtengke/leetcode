package medium;

import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-09
 **/
public class ScoreofParentheses {
    public int scoreOfParentheses(String S) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if(ch==')') {
                if(stack.isEmpty()) stack.push("1");
                else {
                    if(!stack.peek().equals("(")) {
                        String s = stack.pop();
                        int  ss = Integer.valueOf(s) * 2;
                        stack.pop();
                        while(!stack.isEmpty() && !stack.peek().equals("(")) {
                            ss = ss + Integer.valueOf(stack.pop());
                        }
                        stack.push(String.valueOf(ss));

                    }
                    else {
                        String s = stack.pop();
                        int ss = 0;
                        if(!s.equals("(")) ss = (Integer.valueOf(s)+1);
                        else  ss = 1;
                        while(!stack.isEmpty() && !stack.peek().equals("(")) {
                            ss = ss + Integer.valueOf(stack.pop());
                        }
                        stack.push(String.valueOf(ss));
                    }
                }
            }
            else stack.push(String.valueOf(ch));
        }
        return Integer.valueOf(stack.pop());
    }

    public static void main(String[] args) {
        ScoreofParentheses scoreofParentheses = new ScoreofParentheses();
         scoreofParentheses.scoreOfParentheses("(()())");
    }

}
