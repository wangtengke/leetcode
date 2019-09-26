package nowcoder2018;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-09-08
 **/
public class Main35 {

    public static void main(String[] args) {
//        Main35 mac = new Main35();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] height = new int[n];
//        for (int i=0;i<n;i++){
//            height[i] = sc.nextInt();
//        }
//        System.out.println(mac.robot(height));
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> table = new Hashtable<>();
        map.put(null, 1);
        table.put(null, 0);

    }

    public int robot(int[] height){
        int res=0;
        int index=0;
        int[] flags = new int[height.length];
        for (int i=height.length-1;i>=0;i--){
            for (int j=i-1;j>=0;j--){
                if(height[j]>=height[i]){
                    flags[j]+=1;
                    if (flags[j]>=res){
                        res = flags[j];
                        index =j;
                    }
                    break;
                }
            }
        }
        return res==0?0:height[index];
    }
}
