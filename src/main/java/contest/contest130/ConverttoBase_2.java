package contest.contest130;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-31
 **/
public class ConverttoBase_2 {
    public String baseNeg2(int N) {
        if(N==0)
            return "0";
        int[] arr = new int[9999];
        int count = 0;
        while (N>0){
            int pop = N%2;
            N = N/2;
            arr[count++] = pop;
        }
        for (int i = 0; i <=count ; i++) {
            if(arr[i]==2){
                arr[i]=0;
                arr[i+1]++;
            }
            if(i%2==1&&arr[i]==1){
                arr[i+1]++;
            }
        }
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i <=count ; i++) {
            ans.append(String.valueOf(arr[i]));
        }
        if(arr[count+1]==1){
            ans.append(String.valueOf(arr[count+1]));
        }
        ans.reverse();
        if(ans.charAt(0)=='0')
            ans.deleteCharAt(0);
        return ans.toString();
    }

    public static void main(String[] args) {
        ConverttoBase_2 converttoBase_2 = new ConverttoBase_2();
        System.out.println(converttoBase_2.baseNeg2(31));
    }
}
