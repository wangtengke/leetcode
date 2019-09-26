//package nowcoder2018;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * @program: leetcode
// * @description:
// * @author: wangtengke
// * @create: 2019-09-08
// **/
//public class Main {
//    public static void main(String[] args) {
//        Main mac = new Main();
//        Scanner sc = new Scanner(System.in);
//        int[] bucket = new int[3];
//        for (int i=0;i<3;i++){
//            bucket[i]=sc.nextInt();
//        }
//        int target =sc.nextInt();
//        System.out.println(mac.pour(bucket,target));
//    }
//
//    public int pour(int[] bucket,int target){
//        Arrays.sort(bucket);
//        int a = canMeasureWater(bucket[0],bucket[1],target);
//        int b = canMeasureWater(bucket[0],bucket[2],target);
//        int c = canMeasureWater(bucket[1],bucket[2],target);
//        if (a==-1 && b ==-1 && c==-1){
//            return -1;
//        }
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        return a;
//    }
//
//    public int canMeasureWater(int x, int y, int z) {
//        if (z==0){
//            return -1;
//        }
//        if (x+y<z){
//            return -1;
//        }
//        if (x<y){
//            int temp;
//            temp=x;
//            x=y;
//            y=temp;
//        }
//        if(y==0){
//            return z%x==0?z/x:-1;
//        }
//        int r = x%y;
//        int count =0;
//        while (r>0){
//            x=y;
//            y=r;
//            r=x%y;
//            count++;
//        }
//        return z%y==0?count:-1;
//    }
//
//}
