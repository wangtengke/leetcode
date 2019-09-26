package tencent;

import java.util.Scanner;
import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-05
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        for (int i = 0; i <n ; i++) {
//            arr[i] = scanner.next();
//        }
        String s = scanner.next();
        String[] arr = s.split("");
        int ret = getresult(arr);
        System.out.println(ret);
    }

    private static int getresult(String[] arr) {
        Stack<String> stack =new Stack<String>();
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty())
                stack.push(arr[i]);
            else if(!stack.peek().equals(arr[i]))
                stack.pop();
            else
                stack.push(arr[i]);
        }
        return stack.size();
    }

}
