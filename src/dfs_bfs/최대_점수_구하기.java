package dfs_bfs;

import java.util.Scanner;

public class 최대_점수_구하기 {
    public static int n;  // n개의 문제.
    public static int m;  // 제한시간.
    public static int max;
    public static int[] time;
    public static int[] score;

    public static void dfs(int L, int timeSum, int scoreSum) {
        if(timeSum > m) return;
        if(L==n) {
            max=Math.max(max, scoreSum);
        } else {
            dfs(L+1, timeSum+time[L], scoreSum+score[L]);
            dfs(L+1, timeSum, scoreSum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        time = new int[n];
        score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        dfs(0, 0, 0);
        System.out.println(max);
    }
}
