package test;

/**
 * @program: leetcode
 * @description: 测试1
 * @author: wangtengke
 * @create: 2018-12-20
 **/
public class test1 {
    public static String multiply(String k, Integer m) {
        String[] ks = k.split("");
        int [] result = new int[ks.length+1];
        int high = 0;
        int prehigh = 0;
        for (int i = ks.length-1; i >=-1; i--) {
            if(i==-1){
                result[i+1] = prehigh;
                break;
            }
            int res=Integer.valueOf(ks[i])*m+prehigh;
            int low = res%10;
            high = res/10;
            result[i+1] = low;
            prehigh = high;
        }
        StringBuffer sb = new StringBuffer();
        for (int i =0; i <result.length ; i++) {
            if(i==0 && result[0]==0){
             continue;
            }
            sb.append(result[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(test1.multiply("999999999999999999999999999999999999999",9));
    }
}
