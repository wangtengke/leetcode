package medium;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-12
 **/
public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] w, int d) {
        int n = w.length;
        int[] sum = new int[n];
        sum [0] = w[0];
        for(int i=1; i<n; i++) sum[i] = sum[i-1] + w[i];

        int low = 0;
        int high = sum[n-1];
        while(high>low){
            int mid = low + (high - low)/2;
            System.out.println(mid);
            System.out.println("high: "+ high);
            System.out.println("low: "+ low);
            if(check(mid, w, d)) low = mid+1;
            else high = mid;
        }
        return low;
    }

    public boolean check(int mid, int[] w, int d){
        int subsum = 0;
        int count = 1;
        for(int i=0; i<w.length; i++){
            if(subsum + w[i]>mid){
                count++;
                subsum=0;
            }
            subsum += w[i];
        }
        return count>d;
    }

    public static void main(String[] args) {
        CapacityToShipPackagesWithinDDays capacityToShipPackagesWithinDDays = new CapacityToShipPackagesWithinDDays();
        capacityToShipPackagesWithinDDays.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5);
    }

}
