package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-18
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> ss = new ArrayList<>();
        String line = scanner.nextLine();
        while(line.length()>1) {
            ss.add(line);
            line = scanner.nextLine();
        }
        for(String s: ss) {
            String error ="";
            String[] str = s.split(" ");
            List<String> list = new ArrayList<>();
            for(int i=0; i<str.length; i++) {
                if(str[i].equals("and")) {
                    if (i == 0 || i == str.length - 1 || list.isEmpty() || list.get(list.size()-1).equals("or") || str[i + 1].equals("or")) {
//                        System.out.println("error");
                        error = "error";
                        break;
                    }
                    else {
                        String cur = list.remove(list.size()-1);
                        String now = String.valueOf(Boolean.valueOf(cur) && Boolean.valueOf(str[i+1]));
                        list.add(now);
                        i++;
                    }
                }
                else {
                    if((str[i].equals("true")||str[i].equals("false")) && !list.isEmpty() && !list.get(list.size()-1).equals("or")) {
//                        System.out.println("error");
                        error = "error";
                        break;
                    }
                    else list.add(str[i]);
                }
            }
            if(list.size()<2) {
                if(error.equals("error")) System.out.println("error");
                else if(list.size()==0) System.out.println("error");
                else System.out.println(list.get(0));
                continue;
            }
//        for(String tem: list) {
//            System.out.print(tem);
//            System.out.print(" ");
//        }
//        System.out.println(" ");
            boolean res = true;
            boolean f = false;
            for(int i=0; i<list.size(); i++) {
                if(list.get(i).equals("or")) {
                    if (i == 0 || i == str.length - 1 || list.get(i-1).equals("or")||list.get(i+1).equals("or")) {
//                        System.out.println("error");
                        error = "error";
                        break;
                    }
                    else {
                        if(f==false) {
                            res = Boolean.valueOf(list.get(i-1)) || Boolean.valueOf(list.get(i+1));
                            f = true;
                        }
                        else {
                            res = res || Boolean.valueOf(list.get(i+1));
                        }
                    }
                }
            }
        if(error.equals(""))   System.out.println(res);
        else System.out.println("error");
        }

        }

//        String s = scanner.nextLine();


}
