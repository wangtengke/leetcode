/**
 * @program: leetcode
 * @description:
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 *
 * Note: You may not slant the container and n is at least 2.
 * @author: wangtengke
 * @create: 2018-12-12
 **/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int begin = 0;
        int end = height.length-1;
        int result = 0;
        while (end>begin){
             result = Math.min(height[begin],height[end])*(end - begin)>result ? Math.min(height[begin],height[end])*(end - begin) : result;
            if(height[end]>height[begin]){
                begin ++ ;
            }
            else {
                end --;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] array = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater water= new ContainerWithMostWater();
        water.maxArea(array);
    }

}
