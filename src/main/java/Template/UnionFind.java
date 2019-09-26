package Template;

/**
 * @program: leetcode
 * @description: 并查集模版
 * @author: wangtengke
 * @create: 2019-06-08
 **/
public class UnionFind {
    public int count = 0;
    public int[] root;
    public UnionFind(int n){
        count = n;
        root = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
        }
    }

    public int find(int p){
        while(p!=root[p]){
            root[p] = root[root[p]];
            p = root[p];
        }
        return p;
    }

    public void union(int p, int q){
        p = find(p);
        q = find(q);
        if(p==q) return;
        root[p] = q;
        count--;
    }

}
