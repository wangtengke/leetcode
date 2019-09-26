package medium;

import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-15
 **/
public class ReverseSubstringsBetweenEachPairofParentheses {

    public String reverseParentheses(String s) {
        char[] ch = s.toCharArray();
        Stack<String> stack = new Stack<>();
        for(int i=0; i<ch.length; i++) {
            if(ch[i]==')') {
                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty()) {
                    String cur = stack.pop();
                    if(cur.equals("(")) break;
                    sb.append(cur);
                }
                stack.push(sb.reverse().toString());
            }
            else {
                stack.push(String.valueOf(ch[i]));
            }
        }
        if(stack.size()>1) {
           StringBuilder sb = new StringBuilder();
           while(!stack.isEmpty()) {
               sb.append(stack.pop());
           }
           return sb.reverse().toString();
        }
        return new StringBuilder(stack.peek()).reverse().toString();

    }

    public static void main(String[] args) {
        ReverseSubstringsBetweenEachPairofParentheses reverseSubstringsBetweenEachPairofParentheses = new ReverseSubstringsBetweenEachPairofParentheses();
        String s = reverseSubstringsBetweenEachPairofParentheses.reverseParentheses("(u(love)i)");
        System.out.println(s);
    }
}
