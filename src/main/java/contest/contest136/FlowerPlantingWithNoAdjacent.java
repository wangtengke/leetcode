package contest.contest136;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-12
 **/
public class FlowerPlantingWithNoAdjacent {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[][] mem = new int[N+1][N+1];
        for(int i=0; i<paths.length; i++){
            mem[paths[i][0]][paths[i][1]] = 1;
            mem[paths[i][1]][paths[i][0]] = 1;
        }
        for(int i=1; i<=N; i++){
            if(mem[i][i]==0){
                int max = 0;
                for (int j = 1; j <=N; j++) {
                    if (mem[i][j] != 0) {
                        max = Math.max(max, mem[j][j] + 1);
                    }
                }
                mem[i][i] = max;
            }
        }
        int[] res = new int[N];
        for(int i=0; i<N; i++){
            res[i] = mem[i+1][i+1];
        }
        return res;
    }

    public static void main(String[] args) {
        FlowerPlantingWithNoAdjacent flowerPlantingWithNoAdjacent = new FlowerPlantingWithNoAdjacent();
        flowerPlantingWithNoAdjacent.gardenNoAdj(4,new int[][]{{1,2},{3,4}});
    }

}
