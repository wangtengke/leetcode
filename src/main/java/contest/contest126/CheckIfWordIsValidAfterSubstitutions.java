package contest.contest126;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-03
 **/
public class CheckIfWordIsValidAfterSubstitutions {
    public boolean isValid(String S) {
        String abc = "abc";
        int end = S.length()/3;
        for(int j = 0;j<end;j++) {
            int b = 0;
            for (int i = b; i < S.length() - 2&&i<b+6; i++) {
                String temp = S.substring(i,i+3);
                if (abc.equals(S.substring(i, i + 3))) {
                    b = Math.max(i-3,-0);
                    S = S.replace(temp, "");
                    break;
                }
            }
        }
        if(S.equals(""))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        CheckIfWordIsValidAfterSubstitutions c= new CheckIfWordIsValidAfterSubstitutions();
        c.isValid("aabcbc");
    }
}
