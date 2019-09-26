package nowcoder2018;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-08-17
 **/
public class Main40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] str = s.split(",");
        TreeNode root = new TreeNode(Integer.valueOf(str[0]));
        int first = -1;
        int second = -1;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("null") && first==-1) {
                first = i;
            }
            else if(!str[i].equals("null")) {
                second = i;
            }
        }
        if(first==-1) System.out.println("true");
        int start = 1;
        while(first> start) {
            start = start*2;
        }
        if(start>second) System.out.println("true");
        else System.out.println("false");

    }


}
