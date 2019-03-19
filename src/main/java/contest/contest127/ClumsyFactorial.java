package contest.contest127;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-10
 **/
public class ClumsyFactorial {
    public int clumsy(int N) {
        int sum=0;
        int count = 0;
        int col = 0;
        int tempN= N;
        int[][] arr = new int[N/4+1][4];
        while (tempN>0){
            if(count==4){
                count=0;
                col++;
            }
            arr[col][count]=tempN;
            count++;
            tempN--;
        }
        int[] sums = new int[N/4+1];
        if(N<4){
            if(N==3){
                return 6;
            }
            else if(N==2)
                return 2;
            else if(N==1)
                return 1;
            else
                return 0;
        }
        sums[0]=arr[0][0]*arr[0][1]/arr[0][2]+arr[0][3];
        for (int i = 1; i <arr.length-1; i++) {
            sums[i]=arr[i][0]*arr[i][1]/arr[i][2]-arr[i][3];
        }
        int lastlen = arr[arr.length-1][0];
        if(lastlen==4){
            sums[N/4] = 5;
        }
        else if(lastlen==3){
            sums[N/4]=6;
        }
        else if(lastlen==2){
            sums[N/4]=2;
        }
        else if(lastlen==1){
            sums[N/4]=1;
        }
        sum = sum +sums[0];
        for (int i = 1; i <arr.length ; i++) {
            sum = sum - sums[i];
    }
        return sum;
    }

    public static void main(String[] args) {
        ClumsyFactorial clumsyFactorial = new ClumsyFactorial();
        clumsyFactorial.clumsy(1);
    }
}
