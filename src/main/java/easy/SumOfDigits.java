package easy;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-16
 **/
public class SumOfDigits {
    public int sumOfDigits(int[] A) {
        int min = 0;
        for(int a: A){
            min = Math.min(min, a);
        }
        int sum = 0;
        while(min>0){
            sum = sum + min%10;
            min = min / 10;
        }
        return sum%2==1? 0: 1;
    }

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        sumOfDigits.sumOfDigits(new int[]{1,2,3});
    }

}
