import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2018-12-12
 **/
public class RomantoInteger {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);
        int num=0;
        for (int i=0; i<s.length()-1;i++){
            if(map.get(String.valueOf(s.charAt(i)))>=map.get(String.valueOf(s.charAt(i+1)))) {
                num += map.get(String.valueOf(s.charAt(i)));
            }
            else {
                num -= map.get(String.valueOf(s.charAt(i)));
            }
        }
        return  num + map.get(String.valueOf(s.charAt(s.length()-1)));
    }
    public static void main(String[] args){
        RomantoInteger romantoInteger = new RomantoInteger();
       System.out.println( romantoInteger.romanToInt("III"));
    }
}
