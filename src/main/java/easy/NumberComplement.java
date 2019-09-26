package easy;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-11
 **/
public class NumberComplement {
    public int findComplement(int num) {
        for(long i=1; i<Integer.MAX_VALUE; i=i<<1){
            if(i>num) return (int)(i-num-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        NumberComplement numberComplement = new NumberComplement();
        numberComplement.findComplement(2147483647);
    }
}
