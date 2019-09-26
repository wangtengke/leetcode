package test;


import java.util.*;
public class Main1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int count=0,n=0,temp=1,k = 0,a = 0;
        String ss=sc.nextLine();
        n=ss.length()-1;
        for(int i=0;i<n+1;i++){
            if(ss.charAt(i)<='9'&&ss.charAt(i)>='0'){
                a=(ss.charAt(i)-'0');
                k=i;
            }
        }
        for(int i=0;i<n;i++)
            temp*=10;
        int t=temp/10;
        int kk=k;
        if(k==0&&a==0) {
            for(int i=0;i<temp;i++) {
                if(i%13==5)
                    count++;
            }
        }else {
            //System.out.println(temp+a);
            for(int i=temp;i<temp*10;i++){
                if(i%13==5&&(String.valueOf(i).charAt(k)-'0')==a)
                    count++;
            }
            for(int i=0;i<kk;i++) {
                for(int j=t;j<t*10;j++) {
                    if(j%13==5&&(String.valueOf(j).charAt(k-1)-'0')==a)
                        count++;
                }
                t/=10;
                k--;
            }
        }
        System.out.println(count%1000000007);

    }
}