package huawei;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-31
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
//        double min = 1;
////        int min_num = 0;
////        for (int i = 1; i <=10000 ; i++) {
////            int N = Math.round(num*i)==0?1: (int) Math.round(num * i);
////            if(min > Math.abs(N- num*i)) {
////                min = Math.abs(N - num*i);
////                min_num = i;
////            }
////        }
//////        if(Math.round(min_num * num)==min_num * num + 0.5)
////        int N = (int) Math.round(min_num * num);
////        if(Math.round(min_num * num)==min_num * num + 0.5){
////            N = N - 1;
////        }
////        System.out.println(N + " " + min_num);
        Main m = new Main();
        m.sell(num);

//        System.out.println((float) Math.round(min_num * num)/min_num);
    }

    public void sell(double D){
        int[] M = new int[10001];
        double total,temp;
        int up,down;
        double delta=D;
        int index=0;
        for (int i =1;i<10001;i++){
            total=i*D;
            down=(int)Math.floor(total);
            up=down+1;
            M[i]=total-down>=up-total?up:down;
        }
        for (int i =1;i<10001;i++){
            temp=Math.abs((double) M[i]/i-D);
            if (temp<delta){
                delta=temp;
                index=i;
            }
        }
        System.out.println(M[index]+" "+index);
    }

}
