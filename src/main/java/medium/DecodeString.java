package medium;

import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-09
 **/
public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> res = new Stack<>();
        int i=0;
        res.push("");
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch >='0' && ch <= '9'){
                int start = i;
                while(s.charAt(i+1)>='0' && s.charAt(i+1)<='9') i++;
                count.push(Integer.valueOf(s.substring(start, i+1)));
            }
            else if(ch=='['){
                res.push("");
            }
            else if(ch==']'){
                String str = res.pop();
                StringBuilder sb = new StringBuilder();
                int times = count.pop();
                for (int j = 0; j < times; j += 1) {
                    sb.append(str);
                }
                if(res.size()>0)
                res.push(res.pop() + sb.toString());
            }
            else{
                res.push(res.pop()+ch);
            }
//            System.out.println(res.peek());
            i++;
        }
        return res.pop();
    }

    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString("100[leetcode]"));
    }

}
