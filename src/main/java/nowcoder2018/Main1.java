import java.util.Scanner;

public class Main1 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String getIndexAndLongest(String users, int k) {

        int n = users.length ();
        int count = 0;
        int max = 0;
        int res = 0;
        for(int i = 0; i < n ; i++){
            if(users.charAt ( i ) == 'b'){
                count = 0;
                int j = i + 1;
                while(true){
                    if(j == n )
                        j = 0;
                    if(users.charAt ( j ) == 'b')
                        break;
                    else
                        count++;
                    j++;

                }
                j = i - 1;
                while(true){
                    if(j < 0 )
                        j = n - 1;
                    if(users.charAt ( j ) == 'b')
                        break;
                    else
                        count++;
                    j--;

                }
            }
            if(count > max) {
                max = count;
                res = i;
            }
        }
        Integer bigg = new Integer (res);

        int numg = 0;
        int num = 0;
        int maxnum = 0;
        for(int i = 0; i < n ; i++){
            numg =0;
            num = 0;
            while(true){
                if(i == n)
                    i = 0;
                if(numg >= k && users.charAt ( i )=='g')
                    break;
                if(users.charAt ( i ) == 'b'){
                    num++;
                }
                else {
                    num++;
                    numg++;
                }
                i++;
            }
            if(num > maxnum)
                maxnum = num;
        }

        Integer bigb = new Integer (  maxnum - numg);
        return bigg.toString ()+" "+bigb.toString ();


    }

    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        String res;

        String _users;
        try {
            _users = in.nextLine();
        } catch (Exception e) {
            _users = null;
        }
        int k = in.nextInt ();

        res = getIndexAndLongest(_users, k);
        System.out.println(res);
    }
}