package contest.contest131;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-04-07
 **/
public class VideoStitching {
    public int videoStitching(int[][] clips, int T) {
        Arrays.sort(clips,(a,b)->b[1]-a[1]);
        if(clips[clips.length-1][1]<T)
            return -1;
        int ret = 0;
        int begin = 0;
        for (int i = 0; i < clips.length; i++) {
            if(clips[i][0]<=begin) {
                ret++;
                begin = clips[i][1];
                if(clips[i][1] >= T){
                    return ret;
                }
                else {
                    i=-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        VideoStitching v = new VideoStitching();
        v.videoStitching(new int[][]{{0,1},{1,2}},5);
    }
}
