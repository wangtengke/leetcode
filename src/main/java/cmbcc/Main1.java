package cmbcc;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-17
 **/


import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] ln = new int[n];
            int[] dn = new int[n];
            for (int i = 0; i < n; i++) {
                ln[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                dn[i] = in.nextInt();
            }
            int min = count(ln, dn);
            System.out.println(min);
        }
    }

    private static int count(int[] ln, int[] dn) {
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < ln.length; i++) {
            list.add(new Node(ln[i], dn[i]));
        }

        return count(list);
    }

    private static int count(List<Node> list) {
        List<Node> max = new ArrayList<>();
        if (list == null || list.size() == 0 || isStable(list, max)) {
            return 0;
        }

        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.cost < o2.cost ? 1 : -1;
            }
        });
        int cost1 = 0;
        for (int i = max.size() - 1; i < list.size(); i++) {
            cost1 += list.get(i).cost;
        }
        int cost2 = 0;
        for (int i = 0; i < max.size(); i++) {
            cost2 += max.get(i).cost;
        }

        return Math.min(cost1, cost2 + count(list));
    }

    /**
     * 判断桌子当前是否稳定
     *
     * @param list
     * @return
     */
    private static boolean isStable(List<Node> list, List<Node> max) {
        int maxLen = 0;
        for (int i = 0; i < list.size(); i++) {
            maxLen = maxLen < list.get(i).length ? list.get(i).length : maxLen;
        }
        int m = 0;
        max.clear();
        for (int i = 0; i < list.size(); i++) {
            if (maxLen == list.get(i).length) {
                m++;
                max.add(list.get(i));
            }
        }
        for (int i = 0; i < max.size(); i++) {
            list.remove(max.get(i));
        }

        return m * 2 > (list.size() + max.size());
    }

    static class Node {
        public int length;
        public int cost;

        public Node(int length, int cost) {
            this.length = length;
            this.cost = cost;
        }
    }
}
