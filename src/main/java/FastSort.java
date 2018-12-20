/**
 * @program: leetcode
 * @description: 快排
 * @author: wangtengke
 * @create: 2018-12-20
 **/
public class FastSort {
    public static void main(String []args){
        System.out.println("Hello World");
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }

    public static void sort(int[] a, int low, int high){
       int begin = low;
       int end  = high;
       int key = a[begin];
       while (end>begin){
           while (end>begin && a[end]>=key)
               end--;
           if(a[end]<key){
               int temp = a[end];
               a[end] = a [begin];
               a[begin] = temp;
           }
           while (end>begin && a[begin]<=key)
               begin++;
           if(a[begin]>key){
               int temp = a[end];
               a[end] = a [begin];
               a[begin] = temp;
           }
       }
       if(high>low)
           sort(a,low,begin-1);
       if(high>low)
           sort(a,end+1,high);
    }

}
