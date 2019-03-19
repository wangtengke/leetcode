package contest.contest128;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-17
 **/
public class ComplementofBase10Integer {
    public int bitwiseComplement(int N) {
        String s="";
        while (N>0){
            s=s.concat(String.valueOf(N%2));
            N = N/2;
        }
        String[] ss = s.split("");
        for (int i = 0; i <ss.length ; i++) {
            if(ss[i].equals("1"))
                ss[i]="0";
            else
                ss[i]="1";
        }
        System.out.println(ss);
        int ans = 0;
        int count = 0;
        for (int i = 0; i<ss.length ; i++) {
            ans = (int) (ans + (Integer.valueOf(ss[i]) * Math.pow(2, count)));
            count++;
        }
        return ans;

    }

    public static void main(String[] args) {
        ComplementofBase10Integer complementofBase10Integer = new ComplementofBase10Integer();
        System.out.println(complementofBase10Integer.bitwiseComplement(10));
    }
}
