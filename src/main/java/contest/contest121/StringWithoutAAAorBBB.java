package contest.contest121;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-01-27
 **/
public class StringWithoutAAAorBBB {
    public String strWithout3a3b(int A, int B) {
        String res = "";
        if(A>B){
            if(A/B>=2){
                int pop = A-B*2;
                for(int i=0;i<B;i++){
                    res = res +"aab";
                }
                for(int i=0;i<pop;i++)
                    res = res +"a";
            }
            else if(A/B==1){
                int pop = A%B;
                for (int i = 0; i < B-pop; i++) {
                    res = res + "ab";
                }
                for (int i = 0; i <pop ; i++) {
                    res = res +"aab";
                }
            }
        }
        else {
            if(B/A>=2){
                int pop = B-A*2;
                for(int i=0;i<A;i++){
                    res = res +"bba";
                }
                for(int i=0;i<pop;i++)
                    res = res +"b";
            }
            else if(B/A==1){
                int pop = B%A;
                for (int i = 0; i < A-pop; i++) {
                    res = res + "ba";
                }
                for (int i = 0; i <pop ; i++) {
                    res = res +"bba";
                }
            }
        }
        return res;
    }
}
