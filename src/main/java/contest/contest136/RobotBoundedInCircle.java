package contest.contest136;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-12
 **/
public class RobotBoundedInCircle {
    public boolean isRobotBounded(String in) {
        int t = 0;
        int g= 0;
        for(int i=0; i<in.length(); i++){
                if(in.charAt(i)=='L')
                t++;
            else if(in.charAt(i)=='R')
                t--;
            else
                g++;
        }
        if(g==0)
            return true;

        if(t!=0 && g>0 && (Math.abs(t)%4>0))
            return true;
        if(Math.abs(t)%4==0)
        return false;
        return false;
    }

    public static void main(String[] args) {
        RobotBoundedInCircle robotBoundedInCircle = new RobotBoundedInCircle();
        robotBoundedInCircle.isRobotBounded("LLLRLLLRLLGLLGGRGLLLGGLRRRRRGLRLRLRLGGRGRGRLLLLLLGLLRLGLGLRLGGGRR");
    }

}
