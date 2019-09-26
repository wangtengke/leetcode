package contest.contest129;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-24
 **/
public class SmallestIntegerDivisiblebyKUser {
    public int smallestRepunitDivByK(int K) {
            long a = 1;
            int count = 1;
            while(count<16){
                if(a%K==0){
                    return count;
                }
                count++;
                a = a*10+1;
            }
            return -1;
    }


    public static void main(String[] args) {
        SmallestIntegerDivisiblebyKUser s = new SmallestIntegerDivisiblebyKUser();
        System.out.println(s.smallestRepunitDivByK(5));
    }
}
