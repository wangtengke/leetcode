package cmbcc.MGeeker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-07-21
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        PriorityQueue<Double> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.add((double)scanner.nextInt());
        }
        double res = solve(q);
        System.out.println(res);
    }

    private static double solve(PriorityQueue<Double> q) {
        while(q.size()>1) {
            double first = q.poll();
            double second = q.poll();
            q.add((first + second)/2);
        }
        return q.peek();
    }

}
