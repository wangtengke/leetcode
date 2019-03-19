package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-09
 **/
public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] N = new int[n];
        for (int i = 0; i <n ; i++) {
            N[i]=scanner.nextInt();
        }
        int res = getresult(N,m);
        System.out.println(res);
    }

    private static int getresult(int[] n, int m) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i <n.length ; i++) {
            if(map.containsKey(n[i])){
                map.put(n[i],map.get(n[i])+1);
                map1.put(n[i],map1.get(n[i])+1);
            }
            else {
                map.put(n[i],1);
                map1.put(n[i],1);
            }
        }
        if(map.containsKey(0)&&map.size()< m+1)
            return -1;
        if(!map.containsKey(0)&&map.size()< m)
            return -1;
        int begin = 0;
        int end = n.length-1;
        while (end>begin){
            if(n[begin]==0)
                begin++;
            if(map.get(Integer.valueOf(n[begin]))>1){
                map.put(n[begin],map.get(n[begin])-1);
                begin++;
            }
            else if(map.get(Integer.valueOf(n[begin]))==1)
                break;
        }
        while (end>begin){
            if(n[end]==0)
                end--;
            if(map.get(Integer.valueOf(n[end]))>1){
                map.put(n[end],map.get(n[end])-1);
                end--;
            }
            else if(map.get(Integer.valueOf(n[end]))==1)
                break;
        }
        int res1 = end-begin;
        int begin1 = 0;
        int end1 = n.length-1;
        while (end1>begin1){
            if(n[end1]==0)
                end1--;
            if(map1.get(Integer.valueOf(n[end1]))>1){
                map1.put(n[end1],map1.get(n[end1])-1);
                end1--;
            }
            else if(map1.get(Integer.valueOf(n[end1]))==1)
                break;
            else{
                end1 --;
            }
        }
        while (end1>begin1){
            if(n[begin1]==0)
                begin1++;
            if(map1.get(Integer.valueOf(n[begin1]))>1){
                map1.put(n[begin1],map1.get(n[begin1])-1);
                begin1++;
            }
            else if(map1.get(Integer.valueOf(n[begin1]))==1)
                break;

        }

        int res2 = end1-begin1;
//        System.out.println(end);
//        System.out.println(begin);
//        System.out.println(end1);
//        System.out.println(begin1);
        return Math.min(res1+1,res2+1);
    }

}
